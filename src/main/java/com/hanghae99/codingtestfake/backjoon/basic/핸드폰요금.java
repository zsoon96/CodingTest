package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 핸드폰요금 {
    public static void main ( String[] args ) throws IOException {
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int [] num = new int [n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for ( int i = 0; i< n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        int y = 0;
        int m = 0;
        
        for ( int i = 0; i < n; i++ ) {
            // 통화 시간이 30초 보다 크면
            if ( num[i] >= 30 ) {
                int x = (num[i] / 30) + 1 ;
                y += 10 * x;
            }
            // 아니면
            else {
                y += 10;
            }
        }
        
        for ( int i = 0; i < n; i++ ) {
            // 통화 시간이 60초 보다 크면
            if ( num[i] >= 60 ) {
                int x = (num[i] / 60) + 1;
                m += 15 * x;
            }
            // 아니면
            else {
                m += 15;
            }
        }
        
        // m과 y값 비교해서 적은 쪽 출력
        // y가 m보다 작으면 y출력
        if ( y < m ) {
            System.out.println("Y" + " " + y);
        }
        // m이 y보다 작으면 m출력
        else if ( m < y ) {
            System.out.println("M" + " " + m);
        }
        
        // y와 m이 같으면 둘다 출력
        else if ( m == y ) {
            System.out.println("Y" + " " + "M" + " " + y);
        }
    }
}
