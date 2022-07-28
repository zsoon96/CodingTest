package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상하좌우2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력값이 L이면 x-1
        if ( "L".equals(st.nextToken())) {
            if ( y > 1 ) {
                y -= 1;
            }
            else {
                y -= 0;
            }
        }
        // 입력값이 R이면 x+1
        if ("R".equals(st.nextToken())) {
            if ( y < n ) {
                y += 1;
            } else {
                y += 0;
            }
        }
        // 입력값이 U이면 y-1
        if ( "U".equals(st.nextToken())) {
            if ( x > 1 ) {
                x -= 1;
            }
            else {
                x -= 0;
            }
        }
        // 입력값이 D이면 y+1
        if ( "D".equals(st.nextToken())) {
            if ( x < n ) {
                x += 1;
            }
            else {
                x += 0;
            }
        }
        // 값이 1보다 작거나 n보다 크면 제자리
        System.out.println( x + " " + y);
    }
}
