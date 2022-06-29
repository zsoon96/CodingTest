package com.hanghae99.codingtestfake.backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String answer = "NO";

        Stack<Character> input = new Stack<>();

        String t = br.readLine();
        for ( int i = 0; i < n; i++ ) {
            char tt = t.charAt(i);

            if ( tt == '(' ) {
                input.push(tt);
            }
            else if (input.isEmpty()) {
                System.out.println(answer);
                break;
            }
            else input.pop();

            if ( input.isEmpty() ) {
                answer = "YES";
            } else {
                answer = "NO";
            }
            System.out.println(answer);
        }

    }
}
