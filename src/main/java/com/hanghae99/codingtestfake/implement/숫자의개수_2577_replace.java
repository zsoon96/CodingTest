package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수_2577_replace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int cnt = 0;
        String answer = String.valueOf(a * b * c);

        // 0~9번까지
        for ( int i = 0; i <= 9; i++ ) {
            // 결과값 배열에 i가 포함되어 있다면 갯수 출력
            if ( answer.contains(String.valueOf(i))) {
                // 해당 i의 갯수 산출 ( 전체 문자열 길이 - 해당 i가 포함된 문자열을 제거한 문자열 길이 = i의 개수 )
                cnt = answer.length() - answer.replace(String.valueOf(i), "").length();
                System.out.println(cnt);
            } else {
                // 없으면 0 출력
                System.out.println("0");
            }
        }
    }
}
