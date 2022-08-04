package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 요세푸스문제0_11866_list {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();

        for ( int i = 1; i <= n; i++ ) {
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 리스트에서 삭제할 요소를 참조할 인덱스 변수 설정
        int idx = 0;

        while ( n > 1) {
            // 삭제할 인덱스 업데이트
            idx = ( idx + ( m -1 )) % n;
            // 해당 idx에 위치한 값 삭제하고 출력
            sb.append(list.remove(idx)).append(", ");
            n--;
        }
        // 마지막으로 남은 요소 삭제함과 동시에 출력
        sb.append(list.remove()).append(">");
        System.out.println(sb);
    }
}
