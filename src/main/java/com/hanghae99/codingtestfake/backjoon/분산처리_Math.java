package com.hanghae99.codingtestfake.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 분산처리_Math {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // a의 b승 값 구하고, 1의 자리 수 구하기
            int num = ((int) Math.pow(a,b)) % 10;
            // 1의 자리 수가 0이면 10으로 리턴
            num = num == 0 ? 10 : num;

            System.out.println(num);
        }
    }
}
