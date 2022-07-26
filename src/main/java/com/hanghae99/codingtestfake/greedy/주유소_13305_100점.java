package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주유소_13305_100점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [] km = new int [n-1];
        int [] lt = new int [n];

        st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n-1; i++ ) {
            km[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n; i++ ) {
            lt[i] = Integer.parseInt(st.nextToken());
        }

        // 첫 도시의 리터 가격을 최소 가격으로 설정
        long minCost = lt[0];
        long sum = 0;

        for ( int i = 0; i < n-1; i++ ) {
            // 현재 도시의 리터 가격이 최소 가격보다 작으면 갱신
            if ( lt[i] < minCost ) {
                minCost = lt[i];
            }
            // 최소 가격과 거리 곱해서 더해주기
            sum += minCost * km[i];
        }
        System.out.println(sum);
    }
}
