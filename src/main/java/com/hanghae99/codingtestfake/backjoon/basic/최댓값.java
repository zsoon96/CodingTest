package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int[10];

        for ( int i = 1; i <= 9; i++ ){
            num[i] = Integer.parseInt(br.readLine());
        }

        int idx = 0;
        int temp = 0;

        for ( int i = 1; i < 10; i++ ){
            if ( num[i] > temp) {
                temp = num[i];
                idx = i;
            }
        }
        System.out.println(temp);
        System.out.println(idx);
    }
}
