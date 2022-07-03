package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N번째큰수 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        for ( int i = 0; i < n; i++ ) {
            int [] num = new int[10];
            StringTokenizer line = new StringTokenizer(br.readLine());

            for ( int j = 0; j < 10; j++ ) {
                num[j] = Integer.parseInt(line.nextToken());
            }

            // 정수형 배열 내림차순 정렬 시, 별도의 메소드 생성해야해서
            // 내림차순으로 정렬하고 뒤에서 3번째 수로 출력
            Arrays.sort(num);

            System.out.println(num[7]);
        }
    }
}
