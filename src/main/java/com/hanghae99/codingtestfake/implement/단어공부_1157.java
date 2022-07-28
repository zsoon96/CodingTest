package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toUpperCase(); // 입력값 대문자로 변환
        String [] arr = text.split(""); // 잘라서 배열에 담아주기

        Map <String, Integer> map = new HashMap<>();

        for ( int i = 0; i < arr.length; i++ ) {
            // 중복되는 값이 있으면, 해당 key의 value +1
            if ( map.containsKey(arr[i]) ) {
                map.put(arr[i], map.get(arr[i])+1 );
            }
            // 없으면 새로 key,value 생성
            else {
                map.put(arr[i], 1);
            }
        }

        int max = 0;
        boolean sameKey = false;
        String maxKey = "";

        // 최대 값 판별
        for (String key : map.keySet()) {
            int val = map.get(key);
            // 최대값과 해당 value가 같으면, true
            if ( max == val ) {
                sameKey = true;
            }
            // 최대값보다 해당 value가 크면, false
            if ( max < val ) {
                max = val; // 최대값 갱신
                maxKey = key; // 최대값의 key
                sameKey = false;
            }
        }

        // 결과 출력
        if (sameKey) { // 최대값이 1개 이상 있으면(true) ? 출력
            System.out.println("?");
        } else { // 최대값이 1개이면(false) 최대값의 key 출력
            System.out.println(maxKey);
        }
    }
}
