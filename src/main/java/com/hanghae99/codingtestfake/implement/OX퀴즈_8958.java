package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX퀴즈_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // 입력한 케이스만큼 반복
        for ( int i = 0; i < t; i++ ) {
            String ox = br.readLine();
            int x = 0; // O일 경우, 업데이트 해줄 변수
            int answer = 0; // 케이스별 전체 합산 결과 변수

            for ( int j = 0; j < ox.length(); j++ ) {
                // O라면 x + 1씩 증가시켜주고
                if ( ox.charAt(j) == 'O') {
                    x++;
                // 아니면 (X라면) x = 0
                } else {
                    x= 0;
                }
                // 위 식에서 나온 결과를 더해줌
                answer += x;
            }
            System.out.println(answer);
        }
    }
}
