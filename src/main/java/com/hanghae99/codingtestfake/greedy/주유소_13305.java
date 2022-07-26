package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 주유소_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int [] km = new int[n];
        int [] l = new int[n];
        int price = 0;
        int distance = 0;

        st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n-1; i++ ) {
            km[i] = Integer.parseInt(st.nextToken());
            distance += km[i];
        }

        st = new StringTokenizer(br.readLine());
        for ( int i = 0; i < n; i++ ) {
            l[i] = Integer.parseInt(st.nextToken());
        }

        for ( int i = 0; i < n-1; i++ ) {
            if ( l[i] >= l[i+1] ) {
                price += km[i] * l[i];
                distance -= km[i];
            }
            else {
                price += ( km[i] + km[i+1] ) * l[i];
                distance -= km[i] + km[i+1];
            }

            if ( distance == 0 ) {
                System.out.println(price);
                break;
            }
        }
    }
}
