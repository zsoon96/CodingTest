package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 대표값2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] num = new int[5];

        for ( int i = 0; i < 5; i++ ) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        int avg = 0;
        int add = 0;
        for ( int i = 0; i < 5; i++ ) {
            add += num[i];
        }

        avg = add / 5;

        System.out.println(avg);
        System.out.println(num[2]);
    }
}
