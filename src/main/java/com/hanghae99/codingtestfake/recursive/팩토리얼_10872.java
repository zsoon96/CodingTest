package com.hanghae99.codingtestfake.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팩토리얼_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(factorialRecursive(n));
    }

    public static int factorialRecursive(int n) {
        int answer = 1;
        if ( n <= 1 ) {
            return answer;
        }
        return n * factorialRecursive(n-1);
    }
}
