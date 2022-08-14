package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 양_3184 {
    static char[][] map;
    static int n,m;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int totalSheep;
    static int totalWolf;
    static int sheep, wolf;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        map = new char[n][m];

        for ( int i = 0; i < n; i++ ) {
            String input = br.readLine();
            for ( int j = 0; j < m; j++ ) {
                map[i][j] = input.charAt(j);
            }
        }

        visited = new boolean[n][m];
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < m; j++ ) {
                sheep = 0;
                wolf = 0;
                // 해당 값이 방문하지 않고, 울타리가 아니라면 dfs 호출
                if ( !visited[i][j] && !(map[i][j] == '#')) {
                    dfs(i,j);
                }
                // 양의 수가 많으면 늑대 0
                if (sheep > wolf) {
                    wolf = 0;
                }
                // 늑대 수가 많으면 양 0
                if (sheep < wolf) {
                    sheep = 0;
                }
                // 매 위치마다 산출하여 최종 값에 더해주기
                totalSheep += sheep;
                totalWolf += wolf;
            }
        }
        System.out.print( totalSheep + " " + totalWolf );
    }

    static void dfs (int x, int y) {
        // 해당 값 방문 처리
        visited[x][y] = true;

        // 해당 값이 o면 양의 수 +1
        if ( map[x][y] == 'o' ) {
            sheep++;
        }
        // 해당 값이 v면 늑대의 수 +1
        else if ( map[x][y] == 'v') {
            wolf++;
        }

        // 수직,수평(상하좌우) 이동
        for ( int i = 0; i < 4; i++ ) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 주어진 공간안에서
            if ( nx >= 0 && ny >= 0 && nx < n && ny < m ) {
                // 이동한 값이 위와 같은 동일한 조건에 해당되면 dfs 호출
                if (!visited[nx][ny] && !(map[nx][ny] == '#')) {
                    dfs ( nx, ny );
                }
            }
        }

    }
}
