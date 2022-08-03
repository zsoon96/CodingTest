package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusB4_10951_char {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        // 더이상 입력값이 없을 때까지 아래의 로직 실행
        while ( (str=br.readLine()) != null ) {
            // 입력되는 정수는 1자리 수이기 때문에(a,b < 10) 위치 값 고정
            // 반복되는 객체 생성할 필요 없음 (StringTokenizer)
            int a = str.charAt(0)-48;
            int b = str.charAt(2)-48;

            sb.append(a+b).append("\n");
        }

        System.out.print(sb);
    }
}
