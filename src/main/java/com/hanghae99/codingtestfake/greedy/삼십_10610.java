package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 삼십_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String text = br.readLine();
        // 문자열을 단위별로 쪼개서 배열에 담아주기
        String [] arr = text.split("");
        // 오름차순 정렬 (크기가 큰 순)
        Arrays.sort(arr, Comparator.reverseOrder());

        int add = 0;
        // 각 자리수를 더한 값 산출
        for ( int i=0; i<arr.length; i++ ) {
            add += Integer.parseInt(arr[i]);
        }

        // 30 배수가 되는 조건
        // 1-0이 포함되어야 함
        // 2-각 자리수를 더한 값이 3으로 나누어 떨어져야함
        // 위 조건을 하나라도 충족 못할 경우 -1 출력
        if ( add % 3 != 0 || !text.contains("0")) {
            System.out.println(-1);
        }
        // 충족할 경우, 오름차순 정렬대로 문자열 더해서 출력 ( 제일 큰수 )
        else {
            for ( int i = 0; i < arr.length; i++ ) {
                sb.append(arr[i]);
            }
            System.out.println(sb);
        }
    }
}
