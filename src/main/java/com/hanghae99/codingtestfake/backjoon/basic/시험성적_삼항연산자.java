package com.hanghae99.codingtestfake.backjoon.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 시험성적_삼항연산자 {

    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        System.out.println((score >= 90)?"A": (score >= 80)?"B": (score >= 70)?"C": (score >= 60)?"D":"F");
    }
}
