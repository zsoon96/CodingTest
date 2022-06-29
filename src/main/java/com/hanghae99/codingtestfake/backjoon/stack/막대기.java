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

        int max = height.get(n-1);
        // 만약, 7 9 7 5 6 처럼 6보다 7이 큰데 9 때문에 가려서 안보일 경우를 고려해야함!
        // 즉, 단순히 마지막 요소의 값보다 크다고 다 큰게 아님
        // 끝에서부터 왼쪽으로 크기 비교하면서 값 업데이트 해주는 로직으로 변경
        for ( int i = n-1; i >= 0; i-- ){
            if ( max < height.get(i)) {
                max = height.get(i);
                answer ++;
            }
        }

        System.out.println(answer);
    }
}
