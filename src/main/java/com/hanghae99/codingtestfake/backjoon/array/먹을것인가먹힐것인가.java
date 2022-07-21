package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 먹을것인가먹힐것인가 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        // 전체 테스트
        for (int tt = 0; tt < t; tt++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] nArr = new int[n];
            int[] mArr = new int[m];

            // a 배열 생성
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                nArr[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                mArr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(mArr);

            int cnt = 0;

            for ( int i = 0; i < n; i ++ ){
                for ( int j = m-1; j >= 0; j-- ) {
                    // 현재 a 배열의 수가 b의 마지막 배열의 수보다 크면
                    if ( nArr[i] > mArr[j] ) {
                        // 마지막 배열 인덱스 값 + 1 (mArr[0])
                        cnt += j+1;
                        break;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
