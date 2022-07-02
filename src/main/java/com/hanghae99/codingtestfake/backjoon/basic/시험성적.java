package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시험성적 {

    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if ( 90 <= score ){
            System.out.println("A");
        }

        else if ( 80 <= score ) {
            System.out.println("B");
        }

        else if ( 70 <= score ) {
            System.out.println("C");
        }

        else if ( 60 <= score ) {
            System.out.println("D");
        }

        else {
            System.out.println("F");
        }
    }
}
