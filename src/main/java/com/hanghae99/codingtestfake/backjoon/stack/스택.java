package com.hanghae99.codingtestfake.backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<String> answer = new Stack<>();

        for ( int i = 0; i < n; i++ ) {
            String st = br.readLine();

            if ( st.contains("push")) {
                answer.push(st.split(" ")[1]);
            }

            else if ( st.contains("pop") ) {
                if ( !answer.isEmpty() ) {
                    System.out.println(answer.pop());
                    answer.pop();
                }
                else {
                    System.out.println("-1");
                }
            }

            else if (st.contains("size")) {
                System.out.println(answer.size());
            }

            else if (st.contains("empty")) {
                if ( !answer.isEmpty() ) {
                    System.out.println("0");
                }
                else {
                    System.out.println("1");
                }
            }

            else if (st.contains("top")) {
                if ( !answer.isEmpty() ) {
                    System.out.println(answer.peek());
                }
                else {
                    System.out.println("-1");
                }
            }
        }
    }
}
