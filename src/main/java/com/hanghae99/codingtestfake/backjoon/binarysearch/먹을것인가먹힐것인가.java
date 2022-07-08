package com.hanghae99.codingtestfake.backjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 먹을것인가먹힐것인가 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] arrA = new int[a];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < a; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arrA);

            int[] arrB = new int[b];
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < b; j++) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arrB);

            int cnt = 0;
            for ( int j = 0; j < arrA.length; j++ ) {
                for ( int k = 0; k < arrB.length; k++ ) {
                    if ( arrA[j] <= arrB[k]) {
                        break; // 해당 조건에 만족하면 for문 종료 -> 불필요한 loop 제거
                    } else {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }

    }
}
