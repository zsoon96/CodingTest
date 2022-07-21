package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 먹을것인가먹힐것인가 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        // 전체 테스트
        for ( int i = 0; i < t; i++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] nArr = new int[n];
            int[] mArr = new int[m];

            // a 배열
            st = new StringTokenizer(br.readLine());
            for ( int a = 0; a < n; a++ ) {
                nArr[a] = Integer.parseInt(st.nextToken());
            }

            // b 배열
            st = new StringTokenizer(br.readLine());
            for ( int b = 0; b < m; b++ ) {
                mArr[b] = Integer.parseInt(st.nextToken());
            }

            // 배열간 숫자 비교
            int cnt = 0;
            for ( int j = 0; j < n; j++ ){
                for ( int k = 0; k < m; k++ ){
                    // a가 가지고 있는 숫자가 더 크면 cnt + 1
                    if ( nArr[j] > mArr[k] ) {
                        cnt ++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}
