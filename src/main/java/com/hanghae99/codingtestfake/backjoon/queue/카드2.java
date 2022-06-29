package com.hanghae99.codingtestfake.backjoon.queue;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> card = new LinkedList<>();

        for ( int i = 1; i <= n; i++ ) {
            card.offer(i);
        }

        while ( n -- > 1 ) {
            card.poll();
            card.offer(card.peek()); // 앞의 값 다시 추가해주고 삭제
            card.poll();
        }

        System.out.println(card.peek());
    }
}
