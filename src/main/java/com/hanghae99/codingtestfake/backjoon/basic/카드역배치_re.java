package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드역배치_re {
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int [21];
        for ( int i = 1; i < 21; i++ ) {
            num[i] = i;
        }

        for ( int i = 0; i < 10; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int mid = (end - start) / 2;

            for ( int j = 0; j <= mid; j++ ) {
                int temp = num[start+j];
                num[start+j] = num[end-j];
                num[end-j] = temp;
            }
        }

        for ( int i = 1; i < 21; i++ ) {
            System.out.print( num[i] + " ");
        }
    }
}
