package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기9_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 역삼각형
        for ( int i = 0; i < n; i++ ) {
            // 공백
            for ( int j = 0; j < i; j++ ) {
                System.out.print(" ");
            }
            // 별
            for ( int k = 0; k < ( 2 * n - 1)-(2 * i); k++ ){
                System.out.print("*");
            }
            System.out.println();
        }

        // 삼각형
        for ( int i = 0; i < n-1; i++ ){
            // 공백
            for ( int j = 1; j < (n-1)-i; j++ ){
                System.out.print(" ");
            }
            // 별
            for ( int k = 0; k < 3 + 2 * i; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
