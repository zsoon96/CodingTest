package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Coin0_buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 버퍼리더는 문자열을 한 줄로 읽기 때문에 n과 k를 구분하기 위해 공백을 기준으로 문자열을 분리해주어야 하기에 스트링토크니저 사용
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] coins = new int[n];

        for(int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for ( int i = n-1; i >= 0; i--) {
            if (coins[i] <= k) {
                cnt += k / coins[i];
                k = k % coins[i];
            }
        }
        System.out.println(cnt);
    }
}
