package com.hanghae99.codingtestfake.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 세수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력값 받기
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 배열에 넣어주기
        int [] tw = new int[3];
        tw[0] = a;
        tw[1] = b;
        tw[2] = c;

        // 오름차순 정렬 후 가운데 요소만 출력
        Arrays.sort(tw);
        System.out.println(tw[1]);
    }
}
