package com.hanghae99.codingtestfake.backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 추가 출력을 한번에 묶어 출력하도록 StringBuffer 사용
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(solve(br.readLine())).append("\n");
        }
        System.out.println(sb);
    }

    // 검사해주는 함수 작성
    public static String solve(String s) {

        Stack<Character> input = new Stack<>();

        for ( int i = 0; i < s.length(); i++ ) {
            char ss = s.charAt(i);

            // 여는 괄호일 때 추가
            if ( ss == '(' ) {
                input.push(ss);
            }

            // 닫는 괄호일 때 삭제
            else if (input.empty()) {
                return "NO";
            }
            else input.pop();
        }

        // 검사 후 스택이 비어 있으면 YES
        if ( input.empty() ) {
            return "YES";
        }

        else {
            return "NO";
        }
    }
}
