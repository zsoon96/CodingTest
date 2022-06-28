package com.hanghae99.codingtestfake.backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class X보다작은수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        sc.nextLine();
        String [] num = sc.nextLine().split(" ");
        List<Integer> answer = new ArrayList<>();

        for ( int i = 0; i < num.length; i++ ) {
            if ( Integer.parseInt(num[i]) < x ) {
                answer.add(Integer.parseInt(num[i]));
            }
        }
        System.out.println(answer);
    }
}
