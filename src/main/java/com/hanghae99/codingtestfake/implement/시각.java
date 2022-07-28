package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 완전 탐색 유형 > 가능한 경우의 수를 모두 검사해보는 탐색 방법
public class 시각 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 시간
        int cnt = 0; // 경우의 수

        for ( int i = 0; i <= n; i++ ) {
            for ( int j = 0; j < 60; j++ ) {
                for ( int k = 0; k < 60; k++ ) {
                    // 매 시각에 3이 포함되어 있다면 cnt + 1
                    if ( check(i, j, k)) {
                        cnt ++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    // 특정 시각에 3이 포함되어 있는지 판별하는 함수
    public static boolean check(int h, int m, int s) {
        if ( h % 10 == 3 || m % 10 == 3 || m / 10 == 3 || s % 10 == 3 || s / 10 == 3 ) {
            return true;
        }
        return false;
    }
}
