package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 보물_1026 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] a = new int[n];
        int [] b = new int[n];

        // a 배열 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n; i++ ) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        // b 배열 생성
        st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n; i++ ) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        // 내림차순 (작은 수부터)
        Arrays.sort(a);
        // 오름차순 (큰 수부터)
        reverseSort(b);

        int answer = 0;

        // 같은 인덱스에서 제일 작은 값과 제일 큰 값을 곱한 값의 합이 제일 최소가 됨!
        for ( int i = 0; i < n; i++ ) {
            answer += a[i] * b[i];
        }
        System.out.println(answer);

    }

    // 정수배열 오름차순 정렬 메서드
    public static void reverseSort ( int[] b) {
        Arrays.sort(b);
        // 0부터 자리수 바꿔주기
        for ( int i = 0; i < b.length/2; i++ ) {
            int temp = b[i]; // 현재 위치의 수
            b[i] = b[b.length - i - 1]; // 마지막 위치의 수
            b[b.length - i - 1] = temp; // 교체
        }
    }
}
