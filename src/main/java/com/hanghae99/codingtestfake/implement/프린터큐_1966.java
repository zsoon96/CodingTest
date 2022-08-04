package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class 프린터큐_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while ( t --> 0 ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            LinkedList<int[]> num = new LinkedList<>();

            for ( int i = 0; i < n; i++ ) {
                // [초기 위치, 중요도] 형식으로 리스트에 넣어주기
                num.offer(new int[] {i, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0; // 출력 횟수

            while ( !num.isEmpty()) {

                int[] front = num.poll(); // 가장 첫 원소 추출
                boolean isMax = true; // 가장 중요한 원소인지 판단하는 변수

                for (int i = 0; i < num.size(); i++) {
                    // 첫 원소의 중요도 보다 해당 i번째 원소의 중요도가 더 크다면
                    if (front[1] < num.get(i)[1]) {

                        // 첫 원소와 i 이전의 원소들을 리스트 맨 뒤로 보내주기
                        num.offer(front);
                        for (int j = 0; j < i; j++) {
                            num.offer(num.poll());
                        }

                        // 첫 원소가 가장 큰 원소가 아니였기에 false로 바꾸고 종료
                        isMax = false;
                        break;
                    }
                }

                // 가장 큰 원소가 아니면 아래의 수행문 무시하고 위 반복문 실행
                if (!isMax) {
                    continue;
                }

                // 가장 큰 원소라면 cnt + 1 해주기
                cnt++;

                // 만약 첫 요소의 순서가 궁금해하는 요소(m)라면 cnt 출력 후 반복문 종료
                if (front[0] == m) {
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}
