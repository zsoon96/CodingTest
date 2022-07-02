package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 세수정렬 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] num = new int[3];

        for (int i = 0; i < 3; i++ ) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(num);

        for (int i = 0; i<3; i++) {
            // print : 괄호 안 내용을 단순히 출력 (줄바꿈 필요 없을 때 ! 단, 줄바꿈 문자 (\n)은 제외)
            System.out.print(num[i] + " ");
        }
    }
}
