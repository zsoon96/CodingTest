package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수들의합_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        int n = 1; // 작은 수 부터 빼줄 값

        while ( true ) {
            // s보다 빼야할 값이 작거나 같을 경우
            if ( s >= n ) {
                // s에 작은 수부터 빼주기
                s -= n;
           // 빼다 남은 값(s)이 빼야할 값보다 작을 경우, 멈추기
            } else {
                break;
            }
            // n은 한바퀴 돌때마다 +1
            n++;
        }

        // 빼다 남은 값이 빼야할 값보다 작을 경우에서 멈추고 +1 해줬으니, 출력은 -1한 값
        System.out.println(n-1);
    }
}
