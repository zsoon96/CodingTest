package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 음료수얼려먹기 {

    public static int n, m;
    public static int [][] graph = new int[1000][1000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 2차원 배열 생성 후, 데이터 분리하여 담아주기
        for ( int i = 0; i < n; i++ ) {
            String line = br.readLine();
            for ( int j = 0; j < m; j++ ) {
                graph[i][j] = line.charAt(j)-'0';
            }
        }

        // 모든 위치에 대해 만들 수 있는 아이스크림 갯수 구하기
        int cnt = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                // 현재 위치에서 dfs 함수 실행
                if (dfs(i,j)) {
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
    }

    // dfs로 특정 노드(위치)를 방문하고 연결된 모든 노드들도 방문
    public static boolean dfs ( int x, int y ) {
        // 주어진 범위를 벗어나는 경우에는 즉시 종료
        if ( x <= -1 || x >= n || y <= -1 || y >= m ) {
            return false;
        }

        // 현재 위치가 방문하지 않은 상태라면(0)
        if ( graph[x][y] == 0 ) {
            // 해당 위치 방문 처리(1)
            graph[x][y] = 1;

            // 해당 위치 기준 상/하/좌/우 위치들도 모두 재귀적으로 호출하여 방문이 안되있는 상태라면 모두 방문 처리
            dfs( x-1, y );
            dfs( x , y-1 );
            dfs(x+1, y );
            dfs( x, y+1 );
            return true;
        }
        // 현재 위치가 방문처리가 되어있는 상태라면(1) 연결된 노드 탐색 X
        return false;
    }
}
