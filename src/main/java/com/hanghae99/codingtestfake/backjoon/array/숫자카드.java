package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());

        int num [] = new int[n];

        StringTokenizer line = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
//            StringTokenizer line = new StringTokenizer(br.readLine());
            num[i] = Integer.parseInt(line.nextToken());
        }

        StringTokenizer ss = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(ss.nextToken());

        int [] test = new int[x];

        StringTokenizer twoLine = new StringTokenizer(br.readLine());
        for (int i = 0; i < x; i++) {
            test[i] = Integer.parseInt(twoLine.nextToken());
        }

        for ( int i = 0; i < x; i++ ){

            if ( test[i] == num[i] ) {
                sb.append("1").append(" ");
            }
            else {
                sb.append("0").append(" ");
            }
        }
        System.out.println(sb);
    }
}
