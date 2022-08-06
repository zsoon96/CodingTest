package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class 미로탈출 {
    public static int n,m;
    public static int[][] position = new int[201][201];

    // 이동할 4가지 방향 정의 (좌,우,상,하)
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // 2차원 배열 생성 후, 데이터 분리하여 담아주기
        for ( int i = 0; i < n; i++ ){
            String line = br.readLine();
            for ( int j = 0; j < m; j++ ) {
                position[i][j] = line.charAt(j) -'0';
            }
        }

        System.out.println(bfs(0, 0));
    }

    public static int bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        // 현재 위치 큐에 담아주기
        q.offer(new Node(x, y));

        // 큐에 데이터가 없을때까지
        while ( !q.isEmpty() ) {
            // 큐의 맨 앞 위치 정보 꺼내서 x, y에 담아주기
            Node node = q.poll();
            x = node.getX();
            y = node.getY();

            // 현재 위치에서 4가지 방향으로 위치 확인 (반복)
            for ( int i = 0; i < 4; i++ ) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 주어진 공간을 벗어난 경우 무시
                if ( nx <= -1 || nx >= n || ny <= -1 || ny >= m ) {
                    continue;
                }
                // 괴물이 있는 경우(0) 무시
                if ( position[nx][ny] == 0 ) {
                    continue;
                }
                // 처음 방문하는 경우(1) 최단 거리 큐에 담아주기
                if ( position[nx][ny] == 1 ) {
                    position[nx][ny] = position[x][y] + 1;
                    q.offer(new Node(nx, ny));
                }
            }
        }
        // 최종 목적지에 도달했을 때의 누적된 최단 거리값 반환
        return position[n-1][m-1];
    }
}
