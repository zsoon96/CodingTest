package com.hanghae99.codingtestfake.backjoon.basic;

import java.util.Scanner;

public class 윷놀이_sc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i < 3; i++ ) {
            int one = 0;
            int zero = 0;

            for (int j = 0; j<4; j++ ) {
                int input= sc.nextInt();

                if ( input == 0 ) {
                    zero++;
                } else {
                    one++;
                }

                if ( zero == 1 && one == 3 ) {
                    System.out.println("A");
                }
                else if ( zero == 2 && one == 2 ) {
                    System.out.println("B");
                }
                else if ( zero == 3 && one == 1 ) {
                    System.out.println("C");
                }
                else if ( zero == 4 ){
                    System.out.println("D");
                }
                else if ( one == 4 ) {
                    System.out.println("E");
                }
            }
        }
    }
}
