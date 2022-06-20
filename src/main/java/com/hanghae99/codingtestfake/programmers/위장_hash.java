package com.hanghae99.codingtestfake.programmers;

import java.util.HashMap;
class Solution5 {
    public int solution(String[][] clothes) {

        // 종류별로 갯수 담아주기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
            // System.out.println(map);
        }

        // 종류별로 안입는 경우 추가한 모든 조합 계산
        int answer = 1;
        for (Integer value : map.values())
            answer *= value + 1;
        // System.out.println(answer);

        // 아예 아무것도 안입는 경우 제외
        return answer -1 ;
    }


    public static void main(String[] args){
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Solution5 sol = new Solution5();
        System.out.println(sol.solution(clothes));
    }
}