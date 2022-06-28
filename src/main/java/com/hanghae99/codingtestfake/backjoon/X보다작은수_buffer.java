package com.hanghae99.codingtestfake.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수_buffer {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());;
        int x = Integer.parseInt(st.nextToken());

        // 입력 형태가 다를 때 마다 선언해서 넣어줘야하나
        StringTokenizer line = new StringTokenizer(br.readLine());
        int [] num = new int [n];

        for ( int i = 0; i < n; i++ ) {
//            num[i] = Integer.parseInt(br.readLine());
            num[i] = Integer.parseInt(line.nextToken());
        }

        for ( int i = 0; i < n; i++ ) {
            if ( num[i] < x ) {
                System.out.print(num[i] + " ");
            }
        }
    }
}
