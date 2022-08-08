package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 섬의개수_4963 {

    static int w,h;
    static int[][] map;
    static int[] dx = {-1,1,0,0,-1,1,-1,1};
    static int[] dy = {0,0,-1,1,-1,-1,1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());

        map = new int[w][h];
        int cnt = 0;


        // 지도 그리기
        for ( int i = 0; i < w; i++ ) {
            st = new StringTokenizer(br.readLine());
            for ( int j = 0; j < h; j++ ) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for ( int i = 0; i < w; i++ ) {
            for ( int j = 0; j < h; j++ ) {
                if ( map[i][j] == 1 ) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void dfs(int a, int b) {
        map[a][b] = 1;

        for ( int i = 0; i < 8; i++ ) {
            int nx = a + dx[i];
            int ny = b + dy[i];

            if ( nx < 0 || nx >= w || ny < 0 || ny >= h ) {
                continue;
            }

            if ( map[nx][ny] == 1 ) {
                dfs(nx, ny);
            }
        }
    }
}
