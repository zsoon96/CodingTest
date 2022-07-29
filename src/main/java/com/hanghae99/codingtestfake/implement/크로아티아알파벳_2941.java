package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 크로아티아알파벳_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine();

        String [] alpa = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for ( int i = 0; i < alpa.length; i++ ) {
            if ( text.contains(alpa[i]) ) { // text에 크로아티아 알파벳이 포함되어있으면
                text = text.replace(alpa[i], "!" ); // 해당 알파벳을 !로 치환
            }
        }
        System.out.println(text.length()); // 문자열의 갯수가 곧 구하고자 하는 수
    }
}
