package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 설탕배달_2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        while ( true ) {
            // 5로 바로 나누어 떨어지면 게임 끝
            if ( n % 5 == 0 ) {
                answer += n / 5;
                System.out.println(answer);
                break;
            }
            // 아니면 3을 빼주고 +1
            else {
                n -= 3;
                answer ++;
            }
            // 만약 n이 음수가 나오면 -1 출력
            if ( n < 0 ) {
                System.out.println(-1);
                break;
            }
        }
    }
}
