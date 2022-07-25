package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수들의_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int answer = 0;

        for ( int i = 1; i < n; i++ ) {
            if ( n >= 0 ) {
                n -= i;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
