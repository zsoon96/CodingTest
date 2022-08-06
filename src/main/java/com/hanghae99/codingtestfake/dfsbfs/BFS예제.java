package com.hanghae99.codingtestfake.dfsbfs;

// BFS: 너비 우선 탐색 - 그래프에서 가까운 노드부터 우선적으로 탐색하는 알고리즘
// 큐 자료구조 이용
// 구체적인 동작과정
    // 1. 탐색 시작 노드를 큐에 삽입하고 방문 처리한다.
    // 2. 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리한다.
    // 3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복한다.

// 특정 조건에서의 최단 경로문제를 해결하기 위한 목적으로도 효과적으로 사용되는 알고리즘!

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS예제 {

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

        bfs(1);
    }

    public static void bfs( int start ) {
        Queue<Integer> q = new LinkedList<>();
        // 해당 노드를 큐에 저장
        q.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = true;
        // 큐가 빌 때까지 반복
        while ( !q.isEmpty() ) {
            // 큐에서 첫 원소를 뽑아 출력
            int x = q.poll();
            System.out.print( x + " " );
            // x의 인접한 숫자의 갯수만큼 아래의 로직 실행
            for ( int i = 0; i < graph.get(x).size(); i++ ) {
                // x와 인접한 숫자들을 순차적으로 y에 담아줌
                int y = graph.get(x).get(i);
                // 만약 y가 방문 처리가 안되어 있다면
                if ( !visited[y] ) {
                    // 큐 맨 뒤에 y를 넣어주고, 방문 처리를 해줌
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
}
