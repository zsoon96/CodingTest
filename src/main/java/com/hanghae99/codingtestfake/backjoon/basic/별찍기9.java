package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 별찍기9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for ( int i = n; i > 0; i-- ) {
            for ( int j = i; j < n; j++ ) {
                sb.append(" ");
            }
            for ( int k = 1; k <= i; k++ ) {
                sb.append("*");
            }
            for ( int f = 2; f <= i; f++ ){
                sb.append("*");
            }
            // 아래 구문 들어가면 '출력 형식이 잘못되었습니다' 오류 발생
//            for ( int h = i; h < n; h++ ){
//                sb.append(" ");
//            }
            sb.append("\n");
        }

        for ( int i = 2; i <= n; i++ ) {
            for ( int j = i; j < n; j++ ){
                sb.append(" ");
            }
            for ( int k = 1; k <= i; k++ ){
                sb.append("*");
            }
            for ( int f = 2; f <= i; f++ ){
                sb.append("*");
            }
//            for ( int h = i; h < n; h++ ){
//                sb.append(" ");
//            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
