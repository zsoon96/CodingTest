package com.hanghae99.codingtestfake.greedy;

import java.util.Scanner;

public class Coin0_scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        // n 개수만큼 coins 배열 크기를 가진 배열 생성
        int [] coins = new int[n];

        // 1. 화폐단위 입력 값을 배열에 담아주기
        for(int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        int cnt = 0;
        // 2. 배열에서 큰 값(배열의 끝)부터 순차적으로 반복문 실행
        for (int i = n -1; i >= 0; i--) {
            // 현재 동전의 가치가 동전의 합보다 작거나 같다면 나누어서 몫과 나머지 구하기
            if ( coins[i] <= k) {
                cnt += (k / coins[i]);
                k = k % coins[i];
            }
        }
        System.out.println(cnt);
    }

}
