package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        // a와 b가 같을 경우
        if ( a == b ) {
            System.out.println(0);
        }

        // a가 b보다 클 경우
        if ( a > b ) {
            System.out.println(a-b-1);
            for ( long i = b+1; i < a; i++ ) {
                System.out.print( i + " ");
            }
        }

        // b가 a보다 클 경우
        if ( b > a ) {
            System.out.println(b-a-1);
            for ( long i = a+1; i < b; i++ ) {
                System.out.print( i + " ");
            }
        }
    }
}
