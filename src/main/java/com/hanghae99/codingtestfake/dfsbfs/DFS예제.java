package com.hanghae99.codingtestfake.dfsbfs;

import java.util.*;

// DFS: 깊이 우선 탐색 - 그래프에서 깊은 부분을 우선적으로 탐색하는 알고리즘
// 스택 자료구조나 재귀 함수를 이용
// 구체적인 동작 과정
    // 1. 탐색 시작 노드를 스택에 삽입하고 방문 처리한다.
    // 2. 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면, 그 노드를 스택에 넣고 방문 처리한다.
        // 방문하지 않은 인접노드가 없으면 스택에서 최상단 노드를 꺼낸다.
    // 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복

public class DFS예제 {

    // 방문 여부에 대한 배열
    public static boolean[] visited = new boolean[9]; // 인덱스 0까지 포함
    // 해당 숫자에 인접한 숫자들이 담긴 리스트 (2차원 리스트)
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
        // 그래프 초기화 = 중요 !
        for ( int i = 0; i < 9; i++ ) {
            graph.add(new ArrayList<Integer>());
        }

        // 1과 인접한 숫자들 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // 2와 인접한 숫자들 저장
        graph.get(2).add(1);
        graph.get(2).add(7);

        // 3과 인접한 숫자들 저장
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        // 4와 인접한 숫자들 저장
        graph.get(4).add(3);
        graph.get(4).add(5);

        // 5와 인접한 숫자들 저장
        graph.get(5).add(3);
        graph.get(5).add(4);

        // 6과 인접한 숫자들 저장
        graph.get(6).add(7);

        // 7과 인접한 숫자들 저장
        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        // 8과 인접한 숫자들 저장
        graph.get(8).add(1);
        graph.get(8).add(7);

        dfs(1);
    }

    public static void dfs( int x ) {
        // 현재 노드를 방문 처리
        visited[x] = true;
        System.out.print( x + " " );

        // x의 인접한 숫자의 갯수만큼 아래의 로직 실행
        for ( int i = 0; i < graph.get(x).size(); i++ ) {
            // x와 인접한 숫자들을 순차적으로 y에 담아줌
            int y = graph.get(x).get(i);
            // 만약 y가 방문 처리가 되어있지 않는다면 해당 함수 재호출
            if ( !visited[y] ) {
                dfs(y);
            }
        }
    }
}
