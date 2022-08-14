package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 숫자만점프_2210_hashset {
    static int[][] num;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static HashSet<String> list;

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

        list = new HashSet<>();
        for ( int i = 0; i < 5; i++ ) {
            for ( int j = 0; j < 5; j++ ) {
                // 문자열로 변환
                String str = String.valueOf(num[i][j]);
                dfs (i,j,0,str);
            }
        }

        System.out.println(list.size());
    }

    public static void dfs ( int x, int y, int depth, String str) {
        // 5번 이동하면 그동안 더한 문자열 (6자리수)를 리스트에 담아주기 (중복되는 수는 제외)
        if ( depth == 5 ) {
            list.add(str);
            return;
        }

        // 이동하기 (이동하면서 이동횟수, 문자열 더해주기)
        for ( int i = 0; i < 4; i++ ) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if ( nx >= 0 && ny >= 0 && nx < 5 && ny < 5 ) {
                dfs(nx, ny, depth+1, str + num[nx][ny]);
            }
        }
    }
}
