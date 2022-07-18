package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for ( int i = n; i > 0; i-- ) {
            for ( int j = i; j <= n-1; j++ ) {
                System.out.print(" ");
            }
            for ( int k = i; k > 0; k-- ) {
                System.out.print("*");
            }
            for ( int f = i-1; f > 0; f-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
