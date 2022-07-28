package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 문자열재정렬_re {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        ArrayList<String> text = new ArrayList<>();
        int sum = 0;

        for ( int i = 0; i < input.length(); i++ ) {
            // 문자일 경우, 리스트에 담아주고
            if ( Character.isLetter(input.charAt(i)) ) { // isLetter() : char형 데이터가 문자인지 판단해주는 함수
                text.add(String.valueOf(input.charAt(i)));
            // 숫자일 경우, 바로 더해주기
            } else {
                sum += input.charAt(i) - '0';
            }
        }

        Collections.sort(text);

        // 알파벳 출력
        for ( int i = 0; i < text.size(); i++ ) {
            System.out.print(text.get(i));
        }

        // 숫자가 하나라도 존재하면 문자열 뒤로 출력
        if ( sum != 0 ) {
            System.out.print(sum);
        }

        // 모두 출력
        System.out.println();
    }
}
