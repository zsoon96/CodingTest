package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 나이순정렬 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] person = new String[n][2];

        for ( int i = 0; i < n; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            person[i][0] = st.nextToken(); // 나이
            person[i][1] = st.nextToken(); // 이름
        }

        Arrays.sort(person, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < n; i++) {
            sb.append(person[i][0]).append(" ").append(person[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
