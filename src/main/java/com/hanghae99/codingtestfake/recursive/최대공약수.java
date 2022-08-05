package com.hanghae99.codingtestfake.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 최대공약수 {

    public static void main (String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(factorialRecursive(b, a % b));
    }

    // 유클리드 호제법
    // 두 자연수 a,b에 대해 (a > b) a를 b로 나눈 나머지를 r이라고 하면
    // a와 b의 최대 공약수 == b와 r의 최대 공약수
    public static int factorialRecursive(int a, int b) {
        // a와 b가 나누어 떨어진다면 b가 최대 공약수로 리턴
        if ( a % b == 0 ) {
            return b;
        // 그게 아니라면 해당 함수를 재호출하여 반복 (재귀)
        } else {
            return factorialRecursive(b, a % b);
        }
    }
}
