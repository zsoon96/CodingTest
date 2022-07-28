package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class 문자열재정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<String> text = new ArrayList<>();

        // 문자 / 숫자 구분해서 배열에 담아주기
        for ( int i = 0; i < input.length(); i++ ) {
            // 아스키코드를 활용하여 숫자(0~9) 범위 밖이라면 문자 배열에 담아주고
            if ( input.charAt(i) < 48 || input.charAt(i) > 58 ) {
                text.add(String.valueOf(input.charAt(i)));
            // 아스키코드를 활용하여 숫자(0~9) 범위라면 숫자 배열에 담아주기
            } else {
                num.add((int) input.charAt(i) - '0');
            }
        }

        // 문자열 오름차순 정렬
        Collections.sort(text);

        // 숫자들의 합
        int sum = 0;
        for ( int i = 0; i < num.size(); i++ ) {
            sum += num.get(i);
        }

        // 문자열 + 숫자의 합 담아서 한번에 출력
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < text.size(); i++ ) {
            sb.append(text.get(i));
        }
        sb.append(sum);

        System.out.println(sb);
    }
}
