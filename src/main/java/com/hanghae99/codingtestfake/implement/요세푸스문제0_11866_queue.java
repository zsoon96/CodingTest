package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 요세푸스문제0_11866_queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        // 아래의 구문 사용 시 틀렸습니다..뜸
        // String input = br.readLine();
        // int n = input.charAt(0) - 48;
        // int m = input.charAt(2) - 48;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for ( int i = 1; i <= n; i++ ) {
            q.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        // 큐에 데이터가 있을경우 아래의 로직 수행
        while ( q.size() > 1 ) {

            // m-1만큼 반복하면서
            for ( int i = 0; i < m-1; i++ ) {
                // 맨 앞의 값 삭제와 동시에 맨 뒤로 값 삽입해주기
                q.offer(q.poll());
            }
            // 맨 앞의 값 삭제 후 출력
            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
