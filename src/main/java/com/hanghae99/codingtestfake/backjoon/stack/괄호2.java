package com.hanghae99.codingtestfake.backjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 괄호2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Character> input = new Stack<>();

        // 한 줄씩 확인
        for ( int i = 0; i < n; i++ ){
            String line = br.readLine();
            int length = line.length();

            for ( int j = 0; j < length; j++ ) {
                char text = line.charAt(j);

                if ( text == '(') {
                    input.push(text);
                }

                else {
                    if ( input.size() == 0 ) {
                        input.push(text); // 비어있을 때 닫는 괄호를 넣고 바로 break - false
                        break;
                    }
                    else {
                        input.pop(); // 있으면 삭제
                    }
                }
            }

            if ( input.isEmpty() ) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

            input.clear();
        }
    }
}
