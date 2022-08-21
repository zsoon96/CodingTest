package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 음식물피하기_1743 {
    static int n, m, k, r, c;
    static boolean[][] visited; // 음식물 존재 여부
    static int[][] map; // 방문 처리 여부 (0과 1)
    static int cnt;
    static int max;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];

        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= m; j++ ) {
                map[i][j] = 0;
            }
        }

        // 입력한 좌표값 방문처리 (음식물 표시)
        for ( int i = 0; i < k; i++ ) {
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            visited[r][c] = true;
        }

        // 음식물 있는 곳에만 check 함수 실행
        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= m; j++ ) {
                if ( visited[i][j] ) {
                    cnt = 1; // 영역 추가
                    check (i, j); // 상하좌우 탐색
                    max = Math.max (max, cnt); // 최대값 산출
                }
            }
        }
        System.out.println(max);
    }

    static void check(int x, int y) {
        // 음식물이 있고, 방문처리 1로 바꿈
        map[x][y] = 1;

        // 상하좌우 반복
        for ( int i = 0; i < 4; i++ ) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 주어진 공간에 음식물이 있고, 방문처리가 0일 경우
            // 영역 + 1 주고 해당 위치에서 다시 상하좌우 탐색
            if ( nx > 0 && ny > 0 && nx <= n && ny <= m ) {
                if ( visited[nx][ny] && map[nx][ny] == 0 ) {
                    cnt++;
                    check (nx, ny);
                }
            }
        }
    }
}
