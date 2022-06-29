package com.hanghae99.codingtestfake.backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 상금헌터 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int [] fir = {500, 300, 200, 50, 30, 10};
        int [] sec = {512, 256, 128, 64, 31};

        for ( int i = 0; i < n; i++ ){
            int total = 0;
            StringTokenizer line = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(line.nextToken());
            int b = Integer.parseInt(line.nextToken());


            if ( a == 1 )
                total = fir[0];
            else if ( a > 1 && a <= 3 )
                total+= fir[1];
            else if ( a > 3 && a <= 6 )
                total += fir[2];
            else if ( a > 6 && a <= 10 )
                total += fir[3];
            else if ( a > 10 && a <= 15 )
                total += fir[4];
            else if ( a > 15 && a <= 21 )
                total += fir[5];
//             else
//                total += 0;

            if ( b == 1 )
                total += sec[0];
            else if ( b > 1 && b <= 3 )
                total += sec[1];
            else if ( b > 3 && b <= 7 )
                total += sec[2];
            else if ( b > 7 && b <= 15 )
                total += sec[3];
            else if ( b > 15 && b <= 21 )
                total += sec[4];
//            else
//                total += 0;

            System.out.println(total * 10000);
        }

    }
}
