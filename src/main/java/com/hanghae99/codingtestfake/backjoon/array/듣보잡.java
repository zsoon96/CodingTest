package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();

        // 듣도 못한 사람의 명단 저장 (이름,1)
        for ( int i = 0; i < n; i++ ){
            String nName = br.readLine();
            map.put (nName,1);
        }
        // 보도 못한 사람의 명단 저장 (이름, 1) (단, 같은 이름일 경우 기존 키값에 + 1)
        for ( int i = 0; i < m; i++ ){
            String mName = br.readLine();
            if ( map.containsKey(mName) ) {
                map.put(mName, map.get(mName)+1);
            }
            else {
                map.put(mName,1);
            }
        }

        // value가 2인 key만 담아줄 리스트 생성
        ArrayList<String> answer = new ArrayList<String>();

        for ( String key : map.keySet() ) {
            if ( map.get(key) == 2 ) {
                answer.add(key);
            }
        }

        // 리스트 오름차순 정렬
        Collections.sort(answer);

        // 리스트의 개수 출력
        System.out.println(answer.size());
        // 리스트 내용 출력
        for ( int i = 0; i < answer.size(); i++ ) {
            System.out.println(answer.get(i));
        }

    }
}
