package com.hanghae99.codingtestfake.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 단어의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // split 사용 시, 문자열 앞뒤로 공백이 있을 경우 문자열 + 1
        // String [] text = br.readLine().split(" ");
        // text.legth;

        // 공백 기준으로 문자 자르기
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 요소의 갯수 반환
        System.out.println( st.countTokens() );
    }
}
