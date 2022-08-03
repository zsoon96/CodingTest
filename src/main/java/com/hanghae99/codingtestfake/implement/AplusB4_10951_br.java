package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AplusB4_10951_br {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        // String str = br.readLine() 생성 후 적용하면 메모리 초과남....
        String str;

        // 더이상 입력값이 없을때까지 아래의 로직 실행
        while ( (str = br.readLine()) != null ) {
            st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append("\n");
        }

        System.out.print(sb);
    }
}
