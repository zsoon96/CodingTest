package com.hanghae99.codingtestfake.programmers;

import java.util.Arrays;
import java.util.HashMap;

class Solution4 {
    public boolean solution(String[] phone_book) {

        // 1. HashMap 만들어서 담아주기
        HashMap<String,Integer> map = new HashMap<>();
        for (String number : phone_book) {
            map.put(number,1);
        }

        // 2. 모든 전화번호의 접두어가 HashMap에 있는지 확인
        for (int i = 0; i < phone_book.length; i++)
            for (int j = 1; j < phone_book[i].length(); j++)
                // .containsKey(key): 해쉬맵에 key가 들어있는지 확인
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
        return true;

    }

    public static void main(String[] args){
        String[] phb = {"123","456","789"};
        Solution4 sol = new Solution4();
        System.out.println(sol.solution(phb));
    }
}
