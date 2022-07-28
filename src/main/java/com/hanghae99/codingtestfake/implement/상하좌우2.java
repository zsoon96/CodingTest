package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상하좌우2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        int x = 1;
        int y = 1;

        int [] dx = {0,0,-1,1}; // 상하
        int [] dy = {-1,1,0,0}; // 좌우
        String [] position = {"L","R","U","D"};

        for ( int i = 0; i < input.length; i++ ) {
            // 위치 초기값 설정
            int nx = 1;
            int ny = 1;

            // 입력 값에 맞는 위치만큼 이동
            for ( int j = 0; j < 4; j++ ) {
                if ( input[i].equals(position[j]) ) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            // 공간 범위 벗어 날 경우
            // 해당 조건에 부합하면 이후 반복문 내부의 수행문 무시
            if ( nx < 1 || ny < 1 || nx > n || ny > n ) {
                continue;
            }

            x = nx;
            y = ny;
        }
        System.out.println( x + " " + y );
    }
}
