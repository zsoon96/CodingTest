package com.hanghae99.codingtestfake.programmers;

import java.util.Arrays;
import java.util.Comparator;

class Solution8 {
    public String solution(int[] numbers) {
        String answer = "";
        // 1. 정수를 담아줄 문자열 배열 생성
        String [] str = new String[numbers.length];

        // 2. //int형 배열을 String형 배열로 바꿔주기
        for (int i = 0; i < numbers.length; i++)
            str[i] = String.valueOf(numbers[i]);

        // 3. 문자열을 정렬
        // 정렬 기준 재정의(Comparator 인터페이스 활용) -> 앞/뒤 마주한 두 수를 합쳐 큰 값을 앞으로 정렬 (내림차순)
        Arrays.sort(str, new Comparator<String>() {
//            @Override
            public int compare(String n1, String n2) {
                System.out.println("n1===" + n1 + " n2===" + n2);
                return (n2+n1).compareTo(n1+n2);
            }
        });

        // 4. 정렬된 문자열 더해주기
        for(String num : str)
            answer += num;

        // 5. 입력값이 모두 0일 경우 예외 처리
        if (str[0].equals("0"))
            answer = "0";

        return answer;
        }


    public static void main(String[] args){
        int[] maxNum = {6,10,2};
        Solution8 sol = new Solution8();
        System.out.println(sol.solution(maxNum));
    }
}
