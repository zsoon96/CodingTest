package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM_11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] num = new int [n];

        for ( int i = 0; i < n; i++ ){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int answer = 0;

        for ( int i = 0; i < n; i++ ) {
            // i번 만큼 반복문 돌면서 해당 인덱스값 더해주기
            for ( int j = 0; j <= i; j++ ) {
                answer += num[j];
            }
        }
        System.out.println(answer);
    }
}
