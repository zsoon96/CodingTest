package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의개수_2577_for {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String answer = String.valueOf(a * b * c);

        // 0~9까지 아래의 로직 반복
        for (int i = 0; i <= 9; i++) {
            // 한바퀴 돌때마다 cnt 초기화
            int cnt = 0;
            // 문자열 길이만큼 아래의 로직 반복
            for (int j = 0; j < answer.length(); j++) {
                // 문자열을 돌면서 i랑 같은 값이 있다면, cnt + 1
                if (answer.charAt(j)-48 == i) {
                    cnt++;
                    }
                }
            // 해당 i의 cnt 출력
            System.out.println(cnt);
            }
        }
    }

