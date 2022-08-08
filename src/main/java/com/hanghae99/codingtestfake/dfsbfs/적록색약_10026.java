package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 적록색약_10026 {

    public static int n;
    public static char[][] color;
    public static boolean[][] colorVisit;
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        color = new char[n+1][n+1];

        // 색상값 2차원 배열에 넣어주기
        for ( int i = 0; i < n; i++ ) {
            st = new StringTokenizer(br.readLine());
            String c = st.nextToken();
            for ( int j = 0; j < n; j++ ) {
                color[i][j] = c.charAt(j);
            }
        }

        // 적록색약이 아닌 경우
        colorVisit = new boolean[n+1][n+1];

        int cnt = 0;
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( !colorVisit[i][j] ) {
                    dfs(i,j);
                    cnt++;
                }
            }
        }
        int normalCnt = cnt;

        // 적록색약인 경우
        colorVisit = new boolean[n+1][n+1]; // 방문 여부 배열 초기화
        cnt = 0; // 구역 초기화

        // R을 모두 G로 치환 ==> 요게 포인트 !
        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( color[i][j] == 'R' ) {
                    color[i][j] = 'G';
                }
            }
        }

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( !colorVisit[i][j] ) {
                    dfs(i,j);
                    cnt++;
                }
            }
        }
        int abnormalCnt = cnt;

        System.out.println( normalCnt + " " + abnormalCnt );
    }

    public static void dfs(int a, int b) {
        colorVisit[a][b] = true;
        char c = color[a][b];

        for ( int i = 0; i < 4; i++ ) {
            int x = a + dx[i];
            int y = b + dy[i];

            if ( x >= n || x < 0 || y >= n || y < 0 ) {
                continue;
            }

            if ( !colorVisit[x][y] && color[x][y] == c ) {
                dfs(x, y);
            }
        }

    }
}
