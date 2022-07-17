package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기4_sb {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for ( int i = n; i > 0; i-- ) {
            for ( int j = 0; j < n-i; j++ ) {
                sb.append(" ");
            }
            for ( int k = i; k > 0; k-- ) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
