package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class 소프트인사이드 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        String [] num = new String[n.length()];

        for ( int i = 0; i < num.length; i++ ) {
            num[i] = n.split("")[i];
        }

        Arrays.sort(num, Comparator.reverseOrder());

        for (int i = 0; i < n.length(); i++) {
            System.out.print(num[i]);
        }
    }
}
