package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주유소_13305_17점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [] km = new int[n];
        int [] l = new int[n];
        long price = 0;
        int distance = 0;

        // km 값
        st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n-1; i++ ) {
            km[i] = Integer.parseInt(st.nextToken());
            distance += km[i];
        }

        // 리터당 가격
        st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n; i++ ) {
            l[i] = Integer.parseInt(st.nextToken());
        }

        for ( int i = 0; i < n-1; i++ ) {
            // 현재 가격이 다음 도시의 가격보다 비싸면
            // 현재 가격과 거리를 곱해서 최종 가격에 더해주고, 전체 거리에서 해당 거리 빼주기
            if ( l[i] >= l[i+1] ) {
                price += km[i] * l[i];
                distance -= km[i];
            }
            // 현재 가격이 다음 도시의 가격보다 비싸면
            // 현재의 가격으로 현재 거리와 다음 도시의 거리까지 더한 값과 곱해서 최종 가격 더해주고, 전체 거리에서 해당 거리 빼주기
            else {
                price += ( km[i] + km[i+1] ) * l[i];
                distance -= km[i] + km[i+1];
            }
            // 그래서 남은 거리가 0일 때, 가격 출력
            if ( distance == 0 ) {
                System.out.println(price);
                break;
            }
        }
    }
}
