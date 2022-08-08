package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 섬의개수_4963 {

    static int w,h;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1,1,0,0,-1,1,-1,1};
    static int[] dy = {0,0,-1,1,-1,-1,1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 별 반복
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            map = new int[h][w];
            visit = new boolean[h][w];
            int cnt = 0;

            // 지도 너비와 높이가 0일 경우애는 종료
            if ( w == 0 && h == 0 ) {
                break;
            }

            // 지도 그리기
            for ( int i = 0; i < h; i++ ) {
                st = new StringTokenizer(br.readLine());
                for ( int j = 0; j < w; j++ ) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for ( int i = 0; i < h; i++ ) {
                for ( int j = 0; j < w; j++ ) {
                    if ( map[i][j] == 1 && !visit[i][j] ) { // 방문 여부를 체크해야지 첫 수가 0일 때도 실행됨!
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }

    public static void dfs(int a, int b) {
        visit[a][b] = true;

        for ( int i = 0; i < 8; i++ ) {
            int nx = a + dx[i];
            int ny = b + dy[i];

            if ( nx < 0 || nx >= h || ny < 0 || ny >= w ) {
                continue;
            }

            if ( map[nx][ny] == 1 && !visit[nx][ny] ) {
                dfs(nx, ny);
            }
        }
    }
}
