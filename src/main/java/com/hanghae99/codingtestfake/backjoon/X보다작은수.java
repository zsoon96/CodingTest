package com.hanghae99.codingtestfake.backjoon;

import java.util.Scanner;

public class X보다작은수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int num[] = new int[n];

        for ( int i = 0; i < n; i++ ) {
            num[i] = sc.nextInt();
        }

        // Scanner객체 생성후 사용이 끝나면 sc.close()를 통해 Scanner를 닫아 주면 좋음 (하지 않아도 크게 영향은 x)
        sc.close();

        for ( int i = 0; i < n; i++ ) {
            if ( num[i] < x ) {
                // print : 괄호 안 내용을 단순히 출력 (줄바꿈 필요 없을 때 ! 단, 줄바꿈 문자 (\n)은 제외)
                // println : 괄호 안 내용을 출력 후 한 줄 띄워짐 -> 이걸로 출력하면 출력형식 오류 발생
                System.out.print(num[i] + " ");
            }
        }
    }
}
