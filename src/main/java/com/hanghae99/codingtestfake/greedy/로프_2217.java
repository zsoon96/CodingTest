package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 로프_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] k = new int[n];

        for ( int i = 0; i < n; i ++ ) {
            k[i] = Integer.parseInt(br.readLine());
        }

        int max = 0;
        int a = k[0]; // 최소 무게

        for ( int i = 0; i < n; i++ ) {
            // 현재 무게가 최소 무게보다 작으면 갱신
            if ( k[i] < a ) {
                a = k[i];
            }
        }
        // 최소 무게와 로프의 개수를 구한 후 출력
        max = a * n;
        System.out.println(max);
    }
}
