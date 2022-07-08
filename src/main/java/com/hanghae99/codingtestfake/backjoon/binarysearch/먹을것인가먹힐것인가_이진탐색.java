package com.hanghae99.codingtestfake.backjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 먹을것인가먹힐것인가_이진탐색 {
    static  int a, b;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] arrA, arrB;

    public static void main(String[] args) throws IOException {

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for ( int i = 0; i < t; i++ ) {
            arrA = new int[a];
            for ( int j = 0; j < a; j++ ) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arrA);

            arrB = new int[b];
            for ( int j = 0; j < b; j++ ) {
                arrB[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arrB);

            int cnt = 0;
            // B 배열에서 A 배열의 요소보다 작은 갯수 구해주기
            for ( int j = 0; j < a; j++ ) {
                cnt += binarySearch(arrA[j]);
            }
            System.out.println(cnt);
        }

    }

    public static int binarySearch ( int key ) {
        int start = 0;
        int end = b-1;
        int result = 0;
        while (start <= end) {
            int mid = (start+end)/2;
            if ( arrB[mid] < key ) {
                // A 요소에서의 제일 큰 인덱스 값이 곧 갯수
                result = mid + 1;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
