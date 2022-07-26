package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 전자레인지_10162_re {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;

            // n이 300보다 크거나 같으면 300으로 나눠주고 빼주기
            if ( n >= 300 ) {
                a = n / 300;
                n -= a * 300;
            }

            // n이 60보다 크거나 같으면 60으로 나눠주고 빼주기
            if ( n >= 60 ) {
                b = n /  60;
                n -= b * 60;
            }

            // 남은 n의 수를 10으로 나눠지지 않으면 -1 출력
            if ( n % 10 != 0 ) {
                System.out.println(-1);
            }

            // 10으로 나눠지면 나눈 값 c에 담아 모두 출력
            else {
                c = n / 10;
                System.out.println( a + " " + b + " " + c);
            }

    }
}
