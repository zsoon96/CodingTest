package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 윷놀이_br {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for ( int i = 0; i < 3; i++ ) {
            int one = 0;
            int zero = 0;

            for (int j = 0; j<4; j++ ) {
                int input= Integer.parseInt(st.nextToken());

                if ( input == 0 ) {
                    zero++;
                } else {
                    one++;
                }

                if ( zero == 1 && one == 3 ) {
//                    System.out.println("A");
                    sb.append("A").append("\n");
                }
                else if ( zero == 2 && one == 2 ) {
//                    System.out.println("B");
                    sb.append("B").append("\n");
                }
                else if ( zero == 3 && one == 1 ) {
//                    System.out.println("C");
                    sb.append("C").append("\n");
                }
                else if ( zero == 4 ){
//                    System.out.println("D");
                    sb.append("D").append("\n");
                }
                else if ( one == 4 ) {
//                    System.out.println("E");
                    sb.append("E").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
