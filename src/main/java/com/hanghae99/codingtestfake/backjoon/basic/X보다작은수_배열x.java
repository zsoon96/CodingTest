package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class X보다작은수_배열x {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // stringtokenizer 사용시, IOE 예외 처리 필수!
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        // 새로운 객체 생성없이 기존의 데이터를 더하는 방식
        StringBuilder sb = new StringBuilder();

        // 입력받은 문자 또 분리
        st = new StringTokenizer(br.readLine(), " ");

        for ( int i = 0; i < n; i++ ) {
            int answer = Integer.parseInt(st.nextToken());
            if ( answer < x ) {
                // append() :  문자열 연결
                sb.append(answer).append(' ');
            }
        }
        System.out.println(sb);
    }
}
