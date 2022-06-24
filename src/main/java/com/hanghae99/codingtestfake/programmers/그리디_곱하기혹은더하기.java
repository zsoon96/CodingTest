package com.hanghae99.codingtestfake.programmers;

import java.util.ArrayList;
import java.util.List;

class Solution9 {
    public int solution(String pb) {

//        // 1. 정수 배열 생성
//        List<Integer> num = new ArrayList<>();
//
//        // 2. 문자열 잘라서 형변환 후 정수 배열에 담아주기
//        String[] sp = pb.split("");
//        for ( int i = 0; i < sp.length; i++ ){
//            num.add(Integer.parseInt(sp[i]));
//        }

        // 3. 반복문 돌리면서 인덱스 순으로 연산

        // 문자열 초기값 선언
        // 0이 아스키코드로 48 -> 우리가 필요한 값이 만약 2일 경우, 2가 아스키코드로 50 그렇다면 50-48 하면 정수형 값 구할 수 있음!
        int answer = pb.charAt(0) - '0';

        for ( int i = 1;i< pb.length(); i++) {
            // 문자열을 잘라서 순차적으로 정수 타입으로 변환
            int num = pb.charAt(i) - '0';
            // 112 * 1 < 112 + 1 -> 0이 아닌 1 이하일 경우의 수이면 더해주기
            if ( answer <= 1 || num <= 1 ) {
                answer += num;
            }
            else {
                answer *=  num;
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