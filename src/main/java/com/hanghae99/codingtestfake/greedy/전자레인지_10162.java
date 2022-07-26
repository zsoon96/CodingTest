package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 전자레인지_10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;

        while (true) {
            if ( n % 10 != 0 ) {
                System.out.println(-1);
                break;
            }

            else if ( n % 300 == 0 ) {
                a = n / 300;
                System.out.println(a + " " + b + " " + c);
                break;
            }
            else if ( n % 60 == 0 ) {
                b = n / 60;
                System.out.println(a + " " + b + " " + c);
                break;
            }
            else {
                n -= 10;
                c++;
            }
        }
    }
}
