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

        // key 값 기준으로
        List<String> arr = new ArrayList<>(map.keySet());
        // 사전 순 정렬 후 (오름차순 정렬)
        Collections.sort(arr);

        // value 2인 key만 출력
        for ( String answer : arr ){
            int value = map.get(answer);

            if ( value == 2 ) {
                System.out.println(answer);
            }
        }

    }
}
