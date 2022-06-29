package com.hanghae99.codingtestfake.backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 분산처리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for ( int i = 0; i < n; i ++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int answer = 1;

            for ( int j = 1; j <= b; j++ ) {
                answer = answer * a % 10;
            }
            answer = answer == 0 ? 10 : answer;

            System.out.println(answer);
        }

    }
}
