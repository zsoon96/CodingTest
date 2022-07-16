package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 카드역배치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for ( int i = 0; i < 10; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // 올림을 위해 double로 선언
            double start = Double.parseDouble(st.nextToken());
            double end = Double.parseDouble(st.nextToken());

            // 두 수에서 인덱스 순서의 처음과 끝을 지정하고, 해당 범위 내에서 순서 바꿔주기 + j가 해당 범위의 중간까지만 도달했을 때까지
            for (int j = (int) end, k = (int) start; j >= (int)Math.ceil((end+start)/2); j--, k++ ){
                int temp = num[j-1];
                num[j-1] = num[k-1];
                num[k-1] = temp;
            }
        }

        for ( int i = 0; i < 20; i++ ) {
            System.out.print(num[i] + " ");
        }
    }
}
