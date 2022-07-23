package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지1이될때까지 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;

        while ( n > 1 ) {
            // 나머지가 있으면
            if ( n%k != 0 ) {
                n -= 1;
                cnt++;
            }
            // 나머지가 없으면
            else if ( n%k == 0 ) {
                n /= k;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
