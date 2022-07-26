package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 전자레인지_10162_re2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 입력받은 수를 10으로 나눌 수 없으면 -1
        if ( n % 10 != 0 ) {
            System.out.println(-1);
        }

        // 나눌 수 있으면
        else {
            // 심플하게 생각하자 !!!!!

            // n을 300으로 나눠서 a 값에 넣어주고
            int a = n / 300;
            n %= 300; // n은 300으로 나눈 값의 나머지

            // n을 300으로 나눠서 b 값에 넣어주고
            int b = n / 60;
            n %= 60; // n은 60으로 나눈 값의 나머지

            // 남은 n값에 10을 나눠준 값을 바로 담아서 출력
            System.out.println( a + " " + b + " " + ( n / 10 ));
        }
    }
}
