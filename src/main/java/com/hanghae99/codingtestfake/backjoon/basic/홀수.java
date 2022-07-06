package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 홀수 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 7;
        int [] num = new int[7];

        for ( int i = 0; i < n; i++ ) {
            num[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        // int의 가장 최댓값 = 2147483647
        int min = Integer.MAX_VALUE;

        for ( int i = 0; i < n; i++ ) {
            if ( num[i] % 2 != 0 ) {
                sum += num[i];
                // 최소값과 num[i] 중 작은 값으로 업데이트
                min = Math.min(min, num[i]);
            }
        }

        if ( sum == 0 ) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
