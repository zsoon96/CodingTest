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
            double start = Double.parseDouble(st.nextToken());
            double end = Double.parseDouble(st.nextToken());

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
