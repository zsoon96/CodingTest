package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 삼십_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String text = String.valueOf(n);
        String [] arr = text.split("");
        Arrays.sort(arr, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < arr.length; i++ ) {
            sb.append(arr[i]);
        }

        int answer = Integer.parseInt(sb.toString());

        if ( answer % 30 == 0) {
            System.out.println(answer);
        }

        else {
            System.out.println(-1);
        }
    }
}
