package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for ( int i = 1; i <= n;  i++ ) {
            // 공백은 n-i만큼 생김
            for ( int j = 1; j <= n-i; j++ ) {
                System.out.print(" ");
            }
            // *은 i만큼 생김
            for ( int k = 1; k <= i; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
