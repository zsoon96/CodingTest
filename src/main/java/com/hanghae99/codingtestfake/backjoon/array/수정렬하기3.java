package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] num = new int[n];

        for (int i = 0; i<n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        for (int i = 0; i<n; i++) {
            System.out.println(num[i]);
        }
    }
}
