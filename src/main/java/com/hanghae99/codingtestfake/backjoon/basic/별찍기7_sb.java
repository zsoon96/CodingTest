package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기7_sb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for ( int i = 1; i <= n; i++ ) {
            for ( int j = i; j <= n-1; j++ ) {
                sb.append(" ");
            }
            for ( int k = 1; k <= i; k++ ) {
                sb.append("*");
            }
            for ( int f = 2; f <= i; f++ ){
                sb.append("*");
            }
            sb.append("\n");
        }

        for ( int i = n-1; i > 0; i-- ){
            for (int j = i; j < n; j++) {
                sb.append(" ");
            }
            for ( int k = i; k > 0; k-- ){
                sb.append("*");
            }
            for ( int f = i-1; f > 0; f--) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
