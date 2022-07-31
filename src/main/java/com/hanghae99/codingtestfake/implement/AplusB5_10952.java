package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB5_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ( true ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // a와 b가 0보다 크면 a+b 출력
            if ( a > 0 && b > 0 ) {
                System.out.println(a+b);
            // a와 b가 0이면 스탑
            } else {
                break;
            }
        }
    }
}
