package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 수정렬하기2 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for ( int i = 0; i < n; i++ ) {
            list.add(Integer.parseInt(br.readLine()));
        }

        // Array.sort -> 시간 초
        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            sb.append(list.get(i)).append("\n");
        }

        // StringBuilder에 한번에 담아서 출력해서 시간 save
        System.out.println(sb);
    }
}
