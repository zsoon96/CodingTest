package com.hanghae99.codingtestfake.backjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 그룹단어체커 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

//        StringTokenizer st = new StringTokenizer(br.readLine(),"");
        String [] textList = new String[n];

        for ( int i = 0; i < n; i++ ) {
            textList[i] = br.readLine();
        }

        int cnt = 0;
        int contain = 0;

        for ( int i = 0;  i < n; i++ ) {
            String[] text = textList[i].split("");

            for ( int j = 1; j <= text.length; j++ ) {
                if ( Arrays.asList(text).contains(text[j-1]) ) {
                    contain++;

                    if (contain > 0) {
                        if (text[j - 1] != text[j] || text[j] != text[j + 1]) {
                            cnt += 0;
                        }
                    } else {
                        cnt += 1;
                    }

//                if ( contain > 1) {
//                    if ( text[j-1] != text[j] || text[j] != text[j+1]) {
//                        cnt += 0;
//                    } else { cnt += 1; }
//                }
                } else { cnt+=1;}
            }
        }
        System.out.println(cnt);
    }
}
