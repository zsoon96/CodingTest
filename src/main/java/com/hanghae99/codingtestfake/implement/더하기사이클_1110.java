package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 더하기사이클_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = n;

        while ( true ) {

            // n의 일의 자리수(십의 자리수로 전환) + n의 자리수의 합의 일의 자리수
            n = ((n % 10) * 10) + ((( n / 10 ) + ( n % 10 )) % 10);
            cnt ++;

            // 기존 값과 반복문을 수행한 값이 같을 때 종료
            if ( n == copy ) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
