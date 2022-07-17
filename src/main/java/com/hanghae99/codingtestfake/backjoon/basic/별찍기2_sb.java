package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기2_sb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for ( int i=1; i <= n; i++ ) {
            for ( int j = 1; j <= n-i; j++ ) {
                sb.append(" ");
            }

            for ( int k = 1; k <= i; k++ ) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
