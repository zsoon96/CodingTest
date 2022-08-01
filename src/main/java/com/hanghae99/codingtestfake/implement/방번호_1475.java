package com.hanghae99.codingtestfake.implement;

import org.yaml.snakeyaml.util.ArrayUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 방번호_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        // 포함된 수에 해당하는 갯수 넣어줄 배열 생성
        int[] nums = new int[10];

        // 입력값을 char형 배열로 전환해서 반복문 실행
        for (char c : n.toCharArray()) {
            // char형을 정수형으로 변환
            int num = c - '0';

            // 만약 9일 경우에는 6으로 치환
            if (num == 9) {
                num = 6;
            }
            // 해당 수에 대한 배열에 갯수 증가
            nums[num]++;
        }

        // 9와 6 같이 쓸수 있으므로 총 개수에서 2로 나눠주고 (nums[6]/2),
        // 총 개수가 홀수일 경우를 생각하여 + 나머지 값(nums[6]%2) 로직도 넣어주기
        nums[6] = nums[6] / 2 + nums[6] % 2;

        // 오름차순 정렬
        Arrays.sort(nums);

        // 맨 마지막 수 출력
        System.out.println(nums[9]);
    }
}

