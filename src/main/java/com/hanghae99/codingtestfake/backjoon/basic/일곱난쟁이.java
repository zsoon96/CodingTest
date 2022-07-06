package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일곱난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] height = new int [9];
        int sum = 0;

        for ( int i = 0; i < 9; i++ ) {
            height[i] = Integer.parseInt(br.readLine());
            sum += height[i];
        }

        // 9번 반복하면서
        for ( int i = 0; i < 8; i++ ) {
            // 해당 i와 겹치지 않는 j를 반복해서 조건 판단
            // j는 i의 다음요소
            for ( int j = i+1; j < 9; j++ ) {
                // 전체 더한 값에서 두 요소를 뺀 값이 100일 때
                if ( sum - height[i] - height[j] == 100 ) {
                    // 해당 요소를 0으로 교체
                    height[i] = 0;
                    height[j] = 0;
                    // 오름차순 정렬
                    Arrays.sort(height);
                    // 0의 값인 앞 두 요소를 제외하여 출력
                    for ( int k = 2; k < 9; k++ ) {
                        System.out.println(height[k]);
                    }
                    // 해당 조건식에 만족했다면 바로 종료 -> 더 볼 필요가 없기 때문에
                    return;
                }
            }
        }
    }
}
