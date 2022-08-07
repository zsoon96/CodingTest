package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 영역구하기_2583 {

    public static int m, n, k;
    public static boolean[][] visited;
    public static int dx[] = {-1,1,0,0};
    public static int dy[] = {0,0,-1,1};
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        visited = new boolean[m][n];

        for ( int i = 0; i < k; i++ ) {
            // 직사각형 입력
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            // 입력한 직사각형들 방문 처리
            for ( int j = y1; j < y2; j++ ) {
                for ( int k = x1; k < x2; k++ ) {
                    visited[j][k] = true;
                }
            }
        }

        for ( int i = 0; i < m; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                // 방문 처리 안되어있는 곳에 대한 영역의 너비와 갯수 구하기
                if ( !visited[i][j] ) {
                    cnt = 1; // 각 영역의 너비
                    result++; // 영역의 갯수
                    dfs(i, j); // 해당 위치에서 상하좌우에 대한 너비 구하기 위해 dfs 호출
                    list.add(cnt); // 최종 영역의 너비 리스트에 담아주기
                }
            }
        }
        // 구한 영역의 너비들 오름차순 정렬
        Collections.sort(list);
        System.out.print(result + "\n");
        for ( int i = 0; i < list.size(); i++ ) {
            System.out.print( list.get(i) + " " );
        }
    }

    public static void dfs(int a, int b) {
        // 받은 값 방문처리
        visited[a][b] = true;

        // 해당 위치에서 상하좌우에 대해
        for ( int i = 0; i < 4; i++ ) {
            int nx = a + dx[i];
            int ny = b + dy[i];
            // 주어진 공간 안에서
            if ( nx >= 0 && nx < m && ny >= 0 && ny < n ) {
                // 방문처리가 되어있지 않은 곳이 있다면
                if ( !visited[nx][ny] ) {
                    dfs(nx, ny); // 재호출
                    cnt++; // 영역의 너비 + 1
                }
            }
        }
    }
}
