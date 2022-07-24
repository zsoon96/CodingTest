package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 모험가길드 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] num = new int[n];

        for ( int i = 0; i < n; i++ ) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int cnt = 0; // 현재 그룹에 포함된 모험가의 수
        int group = 0; // 총 결성된 그룹의 수

        for ( int i = 0; i < n; i++ ) { // 공포도가 낮은 순으로부터 확인
            cnt += 1; // 현재 그룹에 해당 모험가를 포함
            if( cnt >= num[i] ) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면 그룹 결성
                group += 1; // 그룹 결성
                cnt = 0; // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }
        System.out.println(group);
    }
}
