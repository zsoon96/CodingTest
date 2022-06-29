package com.hanghae99.codingtestfake.backjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<String> list = new LinkedList<>();
        int last = 0;

        for ( int i = 0; i < n; i++ ) {
            String dp = br.readLine();

            if ( dp.contains("push")) {
                last = Integer.parseInt(dp.split(" ")[1]);
                list.offer(String.valueOf(last));
            }

            else if ( dp.contains("pop")) {
                if ( !list.isEmpty() ) {
                    System.out.println(Integer.parseInt(list.peek()));
                    list.poll();
                }
                else {
                    System.out.println(-1);
                }
            }

            else if ( dp.contains("size")) {
                System.out.println(list.size());
            }

            else if ( dp.contains("empty")) {
                if ( !list.isEmpty() ) {
                    System.out.println(0);
                }
                else {
                    System.out.println(1);
                }
            }

            else if ( dp.contains("front")) {
                if ( !list.isEmpty() ) {
                    System.out.println(Integer.parseInt(list.peek()));
                }
                else {
                    System.out.println(-1);
                }
            }

            else if ( dp.contains("back")) {
                if ( !list.isEmpty() ) {
                    System.out.println(last);
                }
                else {
                    System.out.println(-1);
                }
            }
        }
    }
}
