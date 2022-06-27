package com.hanghae99.codingtestfake.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Coin0 {

    public static int n;
    public static int k;
    public static ArrayList<Integer> coins = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        // 1. 동전의 종류 배열에 담아주기
        for (int i = 0; i < n; i++) {
            coins.add(sc.nextInt());
        }

        // 2. 배열을 내림차순으로 정렬하기
        Collections.reverse(coins);

        // 3. 반복문을 돌면서 배열의 요소 중 큰값으로 나누어 떨어지면 cnt + 1
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if ( k / coins.get(i) != 0 ) {
                cnt += k / coins.get(i);
                k = k % coins.get(i);
            }
        }
        System.out.println(cnt);
    }
}
