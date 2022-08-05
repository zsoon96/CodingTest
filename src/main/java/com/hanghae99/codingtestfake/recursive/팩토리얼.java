package com.hanghae99.codingtestfake.recursive;

public class 팩토리얼 {

    // n! = 1 * 2 * 3 * 4 ... (n-1) * n == 팩토리얼

    // 반복문으로 구현
    public static int factorialIterative(int n) {
        int result = 1;

        for ( int i = 1; i <= n; i++ ) {
            result *= i;
        }

        return result;
    }

    // 재귀적으로 구현
    public static int factorialRecursive(int n) {
        // n이 1 이하인 경우 1을 반환
        if ( n <= 1 ) {
            return 1;
        }
        // n! = n * (n-1) ... 결과값 반환
        return n * factorialRecursive(n-1);
    }

    public static void main (String[] args) {
        System.out.println("반복문 활용: " + factorialIterative(5));
        System.out.println("재귀함수 활용: " + factorialRecursive(5));
    }
}
