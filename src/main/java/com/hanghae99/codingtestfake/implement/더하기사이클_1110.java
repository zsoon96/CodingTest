package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        int cnt = 0;
        String x = n;

        while ( true ) {
            int a = n.charAt(1) - 48; // 주어진 값 오른쪽 수
            int b = n.charAt(0) - 48; // 주어진 값 왼쪽 수
            int add = a + b;

            n = String.valueOf(a) + String.valueOf(add); // n값 갱신
            cnt ++; // cnt + 1

            if ( x.equals(n) ) {
                break;
            }
        }

        System.out.println(cnt);
    }
}
