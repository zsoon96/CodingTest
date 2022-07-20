package com.hanghae99.codingtestfake.backjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 베스트셀러 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for ( int i = 0; i < n; i++ ){
            // 책이름 입력
            String book = br.readLine();
            // 만약 입력값이 map에 있는 단어라면, 해당 단어의 value를 + 1
            if ( map.containsKey(book) ){
                map.put(book, map.get(book)+1 );
            }
            // 없다면
            else {
                map.put (book, 1);
            }
        }

        int cnt = 0;
        String answer = " ";
        // 가장 많이 나온 책이름 찾기
        for ( String best : map.keySet() ) {
            // best의 개수가 기존 개수보다 많으면,
            if ( cnt < map.get(best) ){
                cnt = map.get(best); // 개수 갱신
                answer = best; // 정답 변경
            }
            // best의 개수와 기존 개수가 같다면, (최대값이 같은 책이름일 경우)
            else if ( cnt == map.get(best) ){
                // 문자열 비교
                // 첫 글자 기준, 아스키코드 차이값을 리턴하기 때문에
                // 양수가 나오게 되면 뒷 비교대상(best)이 사전순으로 앞
                // 음수가 나오게 되면 앞 비교대상(answer)이 사전순으로 앞
                if ( answer.compareTo(best) > 0 ) {
                    answer = best;
                }
            }
        }
        System.out.println(answer);

    }
}
