package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 로프_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] k = new int[n];

        for ( int i = 0; i < n; i ++ ) {
            k[i] = Integer.parseInt(br.readLine());
        }

        // 낮은 무게 순으로 정렬
        Arrays.sort(k);

        int max = 0;
        // 무거운 순으로 가장 최대의 중량 구하기
        // 주의) 모든 로프를 사용하지 않아도 됨 !
        for ( int i = n-1; i >= 0; i-- ) {
            // 현재 중량(k[i])과 병렬 중량이 가능한 경우의 수(n-i) 곱해주고,
            // 기존의 max값과 현재 도출한 값 중에서 최대 값으로 max값 갱신
            k[i] = k[i] * (n-i); // 1, 2, 3 ...
            max = Math.max(max, k[i]);
        }
        System.out.println(max);
    }
}
