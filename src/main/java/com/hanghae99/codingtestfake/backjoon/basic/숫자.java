package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 숫자 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        List<Long> list = new ArrayList<>();
        long temp = 0;

        while (a < b-1) {
            temp = a;
            a = temp + 1;
            list.add(a);
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < list.size(); i++ ) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}
