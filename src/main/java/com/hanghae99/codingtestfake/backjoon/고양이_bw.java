package com.hanghae99.codingtestfake.backjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 고양이_bw {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\\    /\\");
        bw.newLine(); // 줄바꿈 방법 1

        bw.write(" )  ( ')\n"); // 줄바꿈 방법 2

        bw.write("(  /  )");
        bw.newLine();

        bw.write(" \\(__)|");

        // 스트림에 있는 데이터 비우기
        bw.flush();
        // 스트림 종ㄹ
        bw.close();
    }
}
