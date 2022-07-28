package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 왕실의나이트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p = br.readLine();

        // 나이트 현재 위치 구하기
        int row = p.charAt(1) - '0' ; // 문자열 1은 아스키코드로 49 - 0은 아스키코드로 48
        int column = p.charAt(0) - 'a' + 1; // 알파벳 a는 아스키코드로 97 - 97 + 1

        // 이동 가능한 위치의 경우의 수 (최대 8가지)
        int [] dx = {-2, -1, 1, 2, -2, -1, 2, 1};
        int [] dy = {-1, -2, -2, -1, 1, 2, 1, 2};

        int cnt = 0; // 경우의 수
        // 8가지 방향에 대해 이동 가능 여부 구하기
        for ( int i = 0; i < 8; i++ ) {
            // 이동하고자하는 위치 확인
            int nextRow = row + dx[i];
            int nextCol = column + dy[i];
            // 정해진 공간에 벗어나지 않는다면 cnt + 1
            if ( nextRow >= 1 && nextRow <= 8 && nextCol >= 1 && nextCol <= 8 ) {
                cnt ++;
            }
        }
        System.out.println(cnt);

    }
}
