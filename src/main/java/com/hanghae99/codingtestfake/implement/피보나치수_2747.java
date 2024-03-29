package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수_2747 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 1;
        int add = 0;

        // 입력 값이 1일 때에는 1 출력
        if ( n==1 ) {
            System.out.println(1);
        // 그 외 입력 값은 아래의 로직 수행
        } else {
            for ( int i = 1; i < n; i++ ) {
                // 앞뒤랑 더한 수랑 바로 직전의 값이랑 더해주기
                add = x + y;
                x = y; // 직전 값
                y = add; // 더한 값
            }
            System.out.println(add);
        }
    }
}
