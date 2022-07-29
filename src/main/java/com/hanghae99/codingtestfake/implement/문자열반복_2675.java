package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for ( int i = 0; i < t; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String text = st.nextToken();
            String [] arr = text.split("");

            for ( int j = 0; j < arr.length; j++ ) {
                for ( int k = 0; k < n; k++ ) {
                    sb.append(arr[j]);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
