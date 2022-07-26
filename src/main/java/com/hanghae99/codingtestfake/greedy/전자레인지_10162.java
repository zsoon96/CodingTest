package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 전자레인지_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;

        // n이 제일 큰 수(300)로 나눠지기 전까지 작은 수(60, 10)로 빼주기
        while (true) {
            // 60 또는 10으로 빼주고 300으로 나눠지면 한방 승부
            if ( n % 300 == 0 ) {
                a = n / 300;
                System.out.println(a + " " + b + " " + c);
                break;
            }
            // 60으로 나눠지면 -60 cnt +1
            else if ( n % 60 == 0 ) {
                n -= 60;
                b++;
            }
            // 10으로 나눠지면 -10 cnt +1
            else if ( n % 10 == 0 ) {
                n -= 10;
                c++;
            }
            // 위 조건에 해당이 안되면 -1 출력
            else {
                System.out.println(-1);
                break;
            }
        }
    }
}
