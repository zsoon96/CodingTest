package com.hanghae99.codingtestfake.backjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 숫자카드2 {
    public static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int m = Integer.parseInt(br.readLine());


        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < m; i++ ) {
            int key = Integer.parseInt(st.nextToken());

            // upperBound와 lowerBound의 차이 값 구하기
            sb.append(upperBound(num, key)-lowerBound(num, key)).append(" ");
        }
        System.out.println(sb);
    }

    public static int lowerBound (int[] num, int key) {
        int start = 0;
        int end = num.length;

        // 시작점과 끝점이 같이질 때까지 반복
        while (start < end) {
            // 배열의 중간 위치 구하기
            int mid = (start + end) / 2;

            // key값이 중간 위치 값보다 같거나 작을 경우
            if ( key <= num[mid] ) {
                end = mid;
            }

            // key값이 중간 위치 값보다 클 경우
            else {
                start = mid + 1;
            }
        }
        // 찾고자 하는 값이 존재하지 않을 경우
        return start;
    }

    public static int upperBound (int[] num, int key) {
        int start = 0;
        int end = num.length;

        // 시작점과 끝점이 같이질 때까지 반복
        while (start < end) {
            // 배열의 중간 위치 구하기
            int mid = (start + end) / 2;

            // key값이 중간 위치 값보다 작을 경우
            if ( key < num[mid] ) {
                end = mid;
            }

            // key값이 중간 위치 값보다 같거나 클 경우
            else {
                start = mid + 1;
            }
        }
        // 찾고자 하는 값이 존재하지 않을 경우
        return start;
    }
}
