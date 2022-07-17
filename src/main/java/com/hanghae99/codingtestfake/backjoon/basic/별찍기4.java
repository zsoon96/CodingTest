package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class 별찍기4 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for ( int i = n; i > 0; i-- ) {
            for ( int j = 0; j < n-i; j++ ) {
                System.out.print(" ");
            }

            for ( int k = i; k > 0; k-- ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
