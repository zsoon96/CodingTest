package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int [] num = new int[n];

        for (int i = 0; i<n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        // Arrays.sort() 성능이 좋은 편 아님!
        Arrays.sort(num);

        for (int i = 0; i<n; i++) {
            sb.append(num[i]).append("\n");
        }

        System.out.println(sb);
    }
}
