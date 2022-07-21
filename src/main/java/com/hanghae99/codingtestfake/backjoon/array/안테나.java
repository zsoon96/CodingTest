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
        int answer = 0;

        int [] num = new int [n];

        // 배열 생성
        StringTokenizer st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n; i++ ) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 배열을 오름차순 해놓고, 가운데 인덱스의 위치가 거리의 최솟값이 나오게 됨
        // 그렇기 때문에 배열을 오름차순 해놓고, 가운데 인덱스 반환해서 해결
        Arrays.sort(num);

        // 주의, 배열의 길이가 짝수일 경우, 최소값이 2개 나오기 때문에 둘 중 앞요소로 출력해줘야함
        if ( (num.length % 2) == 0 ) {
            answer = num[num.length/2 -1];
        }
        // 배열의 길이가 홀수일 경우, 가운데 인덱스 반환
        else {
            answer = num[num.length/2];
        }

        System.out.println(answer);
    }
}
