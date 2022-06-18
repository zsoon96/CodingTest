package com.hanghae99.codingtestfake.programmers;

import java.util.Arrays;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 1. 두 배열 정렬
        // Arrays.sort()를 통해 오름차순 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 2. completion 배열 길이만큼 반복문 돌려서 두 배열이 다를 때까지 찾기
        int i = 0;
        for ( ; i < completion.length; i++ )
            if(!participant[i].equals(completion[i])) {
                break;
            }

        // 3. 여기까지 온거면, 마지막 주자가 완주하지 못한 선수임
        return participant[i];
    }

    public static void main(String[] args){
        String[] part = {"mislav", "stanko", "mislav", "ana"};
        String[] comp = {"stanko", "ana", "mislav"};
        Solution sol = new Solution();
        System.out.println(sol.solution(part,comp));
    }
}
