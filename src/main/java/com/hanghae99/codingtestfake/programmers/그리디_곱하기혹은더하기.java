package com.hanghae99.codingtestfake.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution9 {
    public int solution(String pb) {

        // 1. 정수 배열 생성
        List<Integer> num = new ArrayList<>();

        // 2. 문자열 잘라서 형변환 후 정수 배열에 담아주기
        String[] sp = pb.split("");
        for ( int i = 0; i < sp.length; i++ ){
            num.add(Integer.parseInt(sp[i]));
        }

        // 3. 반복문 돌리면서 인덱스 순으로 연산
        int answer = num.get(0);
        for ( int j = 1; j < num.size(); j++) {
            if (answer > 0 && num.get(j) > 0 ) {
                answer = answer * num.get(j);
            } else if (answer == 0 || num.get(j) == 0) {
                answer = answer + num.get(j);
            }
        }
        return answer;
    }

    public static void main (String[]args){
        String pb = "02984";
        Solution9 sol = new Solution9();
        System.out.println(sol.solution(pb));
    }
}