package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        int [] coins = {500, 100, 50, 10};

        for ( int i = 0; i < coins.length; i++ ) {
            cnt += n / coins[i];
            n = n - (coins[i] * (n / coins[i]));
        }

        System.out.println(cnt);
    }
}
