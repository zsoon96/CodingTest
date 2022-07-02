package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주사위세개 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        if ( num[0] == num [1] && num[1] == num[2]) {
            System.out.println(10000 + num[0] * 1000);
        }

        else if ( num[0] == num[1] || num[1] == num[2]) {
            System.out.println(1000 + num[1] * 100);
        }

        else {
            System.out.println(num[2] * 100);
        }
    }

}
