package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class R2_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        System.out.println((s * 2) - r1);
    }
}
