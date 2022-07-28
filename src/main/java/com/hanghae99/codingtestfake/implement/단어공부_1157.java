package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단어공부_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine().toUpperCase();
        String [] arr = text.split("");

        Map <String, Integer> map = new HashMap<>();

        for ( int i = 0; i < arr.length; i++ ) {
            if ( map.containsKey(arr[i]) ) {
                map.put(arr[i], map.get(arr[i])+1 );
            }
            else {
                map.put(arr[i], 1);
            }
        }

        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        };

        Map.Entry<String, Integer> maxEntry = Collections.max(map.entrySet(), comparator);

        if ( maxEntry.getKey().length() == 1 ) {
            System.out.println(maxEntry.getKey());
        } else {
            System.out.println("?");
        }
    }
}
