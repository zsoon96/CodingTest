package com.hanghae99.codingtestfake.backjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수찾기 {

    public static int[] num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        num = new int[5];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 이진 탐색 적용하기 위해 반드시 배열 정리
        Arrays.sort(num);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine()," ");

        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < m; i++ ) {
            // 찾고자하는 값이 있으면 1, 없으면 0 출력
            if ( binarySearch(Integer.parseInt(st.nextToken())) >= 0 ) {
                sb.append(1).append("\n");
            }
            else {
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);
    }

    public static int binarySearch (int key) {
        int start = 0;
        int end = num.length-1;

        // 배열의 시작점이 끝점보다 커지기 전까지만 반복
        while (start <= end) {
            // 배열의 중간 위치 구하기
            int mid = (start + end) / 2;

            // key값이 중간 위치 값보다 작을 경우
            if ( key < num[mid] ) {
                end = mid - 1;
            }

            // key값이 중간 위치 값보다 클 경우
            else if ( key > num[mid] ) {
                start = mid + 1;
            }

            // key값이 중간 위치 값과 같을 경우
            else {
                return mid;
            }
        }

        // 찾고자 하는 값이 존재하지 않을 경우
        return -1;
    }
}
