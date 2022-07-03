package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 점수계산 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for ( int i = 1; i <= 8; i++ ) {
            map.put(i, Integer.parseInt(br.readLine()));
        }

        // value 값으로 먼저 정렬 후 가장 큰 수 5개 뽑기 (오름차순)
//        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
//        entryList.sort(Map.Entry.comparingByValue());
//        for(Map.Entry<Integer, Integer> entry : entryList){
//            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//        }

        // value 값으로 먼저 정렬 후 가장 큰 수 5개 뽑기 (내림차순)
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
//        for(Map.Entry<Integer, Integer> entry : entryList){
//            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//        }


        int add = 0;
        int [] num = new int[5];
        for ( int i = 0; i < 5; i++ ) {
            add += entryList.get(i).getValue();
            num[i] = entryList.get(i).getKey();
        }


        Arrays.sort(num);


        System.out.print(add + "\n");
        for (int i = 0; i < 5; i++ ) {
            System.out.print(num[i] + " ");
        }


    }
}
