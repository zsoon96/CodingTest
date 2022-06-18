package com.hanghae99.codingtestfake.programmers;

import java.util.HashMap;

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 1. Hash Map 만들기 (participant)
        HashMap<String,Integer> map = new HashMap<>();
        for (String player : participant) {
            // .getOrDefault(x,y) : x(key)에 해당하는 y(value)가 있으면 가져오고, 없으면 0을 default로 지정
            // 동명이인 때문에 +1
            map.put(player, map.getOrDefault(player, 0) + 1);
//            System.out.println(map);
        }

        // 2. Hash Map 빼기 (completion)
        for (String player : completion) {
            // .get(x) : x(key)에 해당하는 value 반환
            map.put(player, map.get(player)-1);
//            System.out.println(map);
        }

        // 3. value가 0이 아닌 마지막 주자 찾기
        // .keySet() : map이 들고있는 전체 key에 대한 배열 반환
        for (String key : map.keySet()) {
            if (map.get(key) != 0 ){
                answer = key;
                break;
            }
        }
        return answer;

    }

    public static void main(String[] args){
        String[] part = {"mislav", "stanko", "mislav", "ana"};
        String[] comp = {"stanko", "ana", "mislav"};
        Solution2 sol = new Solution2();
        System.out.println(sol.solution(part,comp));
    }
}
