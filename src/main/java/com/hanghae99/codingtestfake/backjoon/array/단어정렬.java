package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어정렬 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[] word = new String[n];

        for ( int i=0; i < n; i++ ) {
            word[i] = br.readLine();
        }

        // 특정 조건으로 정렬하고 싶을 때 Comparator 사용!
        Arrays.sort(word, new Comparator<String>() {
           public int compare(String s1, String s2) {
               // 단어 길이가 같으면
               if ( s1.length() == s2.length() ){
                   return s1.compareTo(s2);
               }
               else {
                   return s1.length() - s2.length();
               }
           }
        });

        StringBuilder sb = new StringBuilder();

        // 아래 중복 검사에서 사용하기 위해 미리 선언
        sb.append(word[0]).append("\n");

        for ( int i = 1; i < n; i++ ) {
            // 중복값 제거
            if(!word[i].equals(word[i-1])) {
                sb.append(word[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}
