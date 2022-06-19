package com.hanghae99.codingtestfake.programmers;

import java.util.Arrays;

class Solution3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        // 1. 배열 안 요소 정렬
        Arrays.sort(phone_book);

        // 2. 반복문을 통해 해당 문자열이 있는지 체크
        // startsWith(): 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크
        // 제일 작은 문자열부터 반복문 실행 > 다른 문자열에 기준이 되는 해당 문자열이 시작되는지 체크
        for (int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String[] phb = {"123","456","789"};
        Solution3 sol = new Solution3();
        System.out.println(sol.solution(phb));
    }
}
