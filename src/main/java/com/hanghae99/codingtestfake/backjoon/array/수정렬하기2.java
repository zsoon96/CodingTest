package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 수정렬하기2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        Map< Integer, Integer > map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++ ) {
            StringTokenizer line = new StringTokenizer(br.readLine());
            map.put(i, Integer.parseInt(line.nextToken()));
        }

        // value 값 기준 정렬 (오름차순)
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
//        for(Map.Entry<Integer, Integer> entry : entryList){
//            System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
//        }

        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i <n; i++ ) {
            sb.append(entryList.get(i).getValue()).append("\n");
        }

        System.out.println(sb);
    }
}
