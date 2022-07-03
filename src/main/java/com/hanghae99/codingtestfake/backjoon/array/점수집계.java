package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 점수집계 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for ( int i = 0; i < n; i++ ) {
            int [] num = new int[5];
            StringTokenizer line = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                num[j] = Integer.parseInt(line.nextToken());
            }

            Arrays.sort(num);

            if ( num[3] - num[1] >= 4) {
                System.out.println("KIN");
            }
            else {
                System.out.println(num[1]+num[2]+num[3]);
            }
        }

    }
}
