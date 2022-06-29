package com.hanghae99.codingtestfake.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상금헌터_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int won = 10000;
        int[] fir = {500, 300, 200, 50, 30, 10};
        int [] firRank = {1,2,3,4,5,6};

        int[] sec = {512, 256, 128, 64, 31};
        int [] secRank = {1,2,4,8,16};

        // --n + n > 0 까지 조건문 실행
        while(n-- > 0){
            StringTokenizer line = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(line.nextToken());
            int b = Integer.parseInt(line.nextToken());
            int money = 0;
            int temp = 0;

            if ( a != 0 ) {
                for (int i = 0; i < 6; i++ ){
                    if ( a <= temp + firRank[i]) {
                        money += fir[i];
                        break;
                    }
                    temp += firRank[i];
                }
            }

            temp = 0;

            if ( b != 0 ) {
                for ( int i = 0; i < 5; i++ ) {
                    if ( b <= temp + secRank[i]) {
                        money += sec[i];
                        break;
                    }
                    temp += secRank[i];
                }
            }
            System.out.println(money * won);
        }
    }
}
