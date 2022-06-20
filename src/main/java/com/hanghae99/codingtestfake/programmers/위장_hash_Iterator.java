package com.hanghae99.codingtestfake.programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution6 {
    public int solution(String[][] clothes) {

        // 종류별로 갯수 담아주기
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
            // System.out.println(map);
        }

        // 종류별로 안입는 경우 추가한 모든 조합 계산
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        int answer = 1;
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            answer *= entry.getValue() + 1;
        }

        // 아예 아무것도 안입는 경우 제외
        return answer -1 ;
    }


    public static void main(String[] args){
        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Solution6 sol = new Solution6();
        System.out.println(sol.solution(clothes));
    }
}