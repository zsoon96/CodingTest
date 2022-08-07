package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연구소_14502 {
    public static int n, m;
    public static int[][] map = new int[8][8];
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};
    public static int[][] mapTemp = new int[8][8]; // 바이러스 살포용 (안전 영역 최대값을 구하기 위해)
    public static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 위치 만들기
        for ( int i = 0; i < n; i++ ) {
            st = new StringTokenizer(br.readLine());
            for ( int j = 0; j < m; j++ ) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 벽 세우기 (완전 탐색) --> 조합(combi)에 대한 이해 미흡
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                if ( map[i][j] == 0 ) {
                    map[i][j] = 1;
                    makeWall(1);
                    map[i][j] = 0;
                }
            }
        }

        System.out.println(result);

    }

    public static void makeWall(int x) {
        // 추가한 벽의 개수가 3이되면 바이러스 퍼트리기
        if ( x == 3 ) {
            spreadVirus();
            return;
        }

        // 추가한 벽의 개수가 3이 될때까지 반복?
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                if ( map[i][j] == 0 ) {
                    map[i][j] = 1;
                    makeWall(x+1);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void spreadVirus() {
        // 그래프 복사 (기존 그래프의 데이터를 유지한 상태에서, 모든 경우의 수를 비교해보고 그 중 안전영역 최댓값을 구하기 위해)
        mapCopy(map, mapTemp);

        // dfs를 사용하여 바이러스 퍼트리기
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ){
                if ( map[i][j] == 2 ) {
                    dfs(i,j);
                }
            }
        }

        // 안전 영역 구하기
        int cnt = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                if (mapTemp[i][j] == 0) {
                    cnt++;
                }
            }
        }

        // 최댓값 구하기 (모든 경우의 수 중에서)
        if ( cnt > result ) {
            result = cnt;
        }
    }

    // 그래프 복사
    public static void mapCopy( int[][]map, int[][]mapTemp) {
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                mapTemp[i][j] = map[i][j];
            }
        }
    }

    // 바이러스가 있는 곳 상하좌우로 퍼트리기
    public static void dfs(int a, int b) {
        // 바이러스 체크
        mapTemp[a][b] = 2;
        // 해당 위치 기준으로 상하좌우를 모두 확인
        for ( int i = 0; i < 4; i++ ) {

            // 주어진 영역에서 벗어나면 아래의 수행문 무시
            if ( a+dy[i] < 0 || a+dy[i] >= n || b+dx[i] < 0 || b+dx[i] >= m ) {
                continue;
            }
            // 이동한 위치가 빈칸이라면 dfs를 통해 바이러스 살포
            if ( mapTemp[a+dy[i]] [b+dx[i]] == 0 ) {
                dfs(a+dy[i], b+dx[i]);
            }
        }
    }

}
