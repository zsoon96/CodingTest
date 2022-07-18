package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for ( int i = 1; i <= n; i++ ) {
            for ( int j = i; j <= n-1; j++ ) {
                System.out.print(" ");
            }
            for ( int k = 1; k <= i; k++ ) {
                System.out.print("*");
            }
            for ( int f = 2; f <= i; f++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
