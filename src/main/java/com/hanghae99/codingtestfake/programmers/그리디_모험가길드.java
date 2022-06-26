package com.hanghae99.codingtestfake.programmers;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 그리디_모험가길드 {
    public static int n;
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // 0. 입력한 값 순차적으로 배열에 담아주기
        for( int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        // 1. 오름차순 정렬
        Collections.sort(numbers);

        // 2. 반복문을 통해 현재모험가의 수(cnt)와 그룹의 수(answer) 구하기
        int cnt = 0;
        int answer = 0;
        for ( int i = 0; i < n; i++) {
            cnt += 1; // 현재 모험가의 수
            // 현재 모험가 수가 해당 인덱스 값보다 크거나 같으면,
            if ( cnt >= numbers.get(i) ) {
                answer += 1; // 그룹 결성
                cnt = 0; // 초기화
            }
        }
        System.out.println(answer);
    }
}
