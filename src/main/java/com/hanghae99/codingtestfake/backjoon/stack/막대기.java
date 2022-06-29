package com.hanghae99.codingtestfake.backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 막대기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> height = new Stack<>();

        for ( int i = 0; i < n; i++ ){
            height.push(Integer.parseInt(br.readLine()));
        }

        int answer = 1; // 자기 자신 포함
        int me = height.get(n-1);
        // 자기 자신과 비교해서 수가 크면 answer 값 ++
        for ( int i = 0; i < n; i++ ){
            if ( me < height.get(i)) {
                answer ++;
            }
        }

        System.out.println(answer);
    }
}
