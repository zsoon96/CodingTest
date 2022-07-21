package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 안테나 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [] num = new int [n];

        // 배열 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n; i++ ) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 배열을 오름차순 해놓고, 가운데 인덱스의 위치가 거리의 최솟값이 나오게 됨
        // 그렇기 때문에 배열을 오름차순 해놓고, 가운데 인덱스 반환해서 해결
        Arrays.sort(num);
        System.out.println(num[(n-1)/2]);
    }
}
