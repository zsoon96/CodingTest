package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자판점프_2210_int {
    static int[][] num;
    static boolean[] visited;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        num = new int[5][5];
        for ( int i = 0; i < 5; i++ ) {
           st = new StringTokenizer(br.readLine());
           for ( int j = 0; j < 5; j++ ) {
               num[i][j] = Integer.parseInt(st.nextToken());
           }
        }

        visited = new boolean[1000000]; // 최종적으로 6자리 수가 999999까지 만들 수 있기때문에!
        cnt = 0;

        for ( int i = 0; i < 5; i++ ) {
            for ( int j = 0; j < 5; j++ ) {
                dfs(i,j,1,num[i][j]);
            }
        }
        System.out.println(cnt);
    }

    public static void dfs( int x, int y, int depth, int val) {
        // 5번 이동하면 아래의 구문 수행
        if ( depth == 6 ) {
            // 만들어진 6자리 숫자의 중복 검증
            if ( !visited[val] ) {
                visited[val] = true;
                cnt++;
            }
            return;
        }
        for ( int i = 0; i < 4; i++ ) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            // 주어진 공간을 벗어나지 않으면
            if ( nx >= 0 && ny >= 0 && nx < 5 && ny < 5 ) {
                int nval = val*10 + num[nx][ny]; // 기존 숫자 10의 자리수로 만들고 새로운 숫자 더하기
                dfs(nx, ny, depth+1, nval); // 6자리 수가 될 때까지 반복
            }
        }
    }
}
