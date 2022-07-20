package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 듣보잡_HashSet {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> hs = new HashSet<String>();
        List<String> list = new ArrayList<String>();

        // 듣도 못한 사람 저장
        for ( int i = 0; i < n; i++ ){
            hs.add(br.readLine());
        }

        // 듣도 못한 사람이 보도 못한 사람에 있을 경우
        for ( int i = 0; i < m; i++ ){
            String answer = br.readLine();
            if ( hs.contains(answer) ) {
                list.add(answer);
            }
        }

        // 리스트 오름차순 정렬
        Collections.sort(list);

        // 리스트 갯수 출력
        System.out.println(list.size());
        // 리스트 내용 출력
        for ( int i = 0; i < list.size(); i++ ) {
            System.out.println(list.get(i));
        }
    }
}
