package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 곱하기혹은더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        String [] num = n.split("");
        int result = Integer.parseInt(num[0]);


        for ( int i = 1; i < num.length; i++ ) {
            // 앞 또는 뒤 숫자가 하나라도 0, 1이면 더해주고
            if ( Integer.parseInt(num[i-1]) <= 1 || Integer.parseInt(num[i]) <= 1 ) {
                result += Integer.parseInt(num[i]);
            }

            // 앞과 뒤 숫자가 1보다 크면 곱해주기
            result *= Integer.parseInt(num[i]);

//            else if ( Integer.parseInt(num[i-1]) > 1 && Integer.parseInt(num[i]) > 1 ) {
//                result *= Integer.parseInt(num[i]);
//            }
        }
        System.out.println(result);
    }
}
