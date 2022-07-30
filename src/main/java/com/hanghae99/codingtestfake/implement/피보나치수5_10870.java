package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = 0;
        int b = 1;
        int add = 0;

        if ( n <= 1) {
            System.out.println(n);
        } else {
            for ( int i = 1; i < n; i++ ) {
                add = a + b;
                a = b;
                b = add;
            }
            System.out.println(add);
        }
    }
}
