package com.hanghae99.codingtestfake.backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> num = new Stack<>();
        int answer = 0;

        for ( int i = 0; i < n; i++ ) {
            int score = Integer.parseInt(br.readLine());

            if ( score > 0 ) {
                num.push(score);
            }
            else {
                if ( num.isEmpty()) {
                    answer += 0;
                }
                else {
                    num.pop();
                }
            }
        }

        for ( int i = 0; i < num.size(); i++ ){
            answer += num.get(i);
        }

        System.out.println(answer);
    }
}
