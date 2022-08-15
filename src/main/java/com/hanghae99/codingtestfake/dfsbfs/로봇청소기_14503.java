package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로봇청소기_14503 {
    static int n, m, r, c, d, cnt;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0}; // 북-동-남-서 순으로
    static int[] dy = {0,1,0,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for ( int i = 0; i < n; i++ ) {
            st = new StringTokenizer(br.readLine());
            for ( int j = 0; j < m; j++ ) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cnt = 1; // 현재 위치 영역
        dfs ( r, c, d); // 현재 로봇 위치에서 청소 시작

        System.out.println(cnt);
    }

    static void dfs ( int x, int y, int position) {
        visited[x][y] = true; // 현재 위치 청소

        for ( int i = 0; i < 4; i++ ) {
            // 왼쪽 방향부터 탐색 (북>동>남>서 --> 북>서>남>동)
            position -= 1;
            if ( position == -1 ) {
                position = 3;
            }

            int nx = x + dx[position];
            int ny = y + dy[position];

            if ( nx >= 0 && ny >= 0 && nx < n && ny < m ) {
                // 청소하지 않았고, 벽이 아닌 영역이면
                if ( !visited[nx][ny] && map[nx][ny] != 1 ) {
                    cnt++; // 청소 영역으로 + 1
                    dfs( nx, ny, position ); // 청소해주러 가기
                    return; // 모든 방향 다 수행했으면 return
                }
            }
        }

        // 반복문을 빠져나왔다면, 더 이상 청소할 공간이 없거나 벽인것이기에
        // 뒤쪽 칸이 벽이 아니라는 전제 하에, 바라보는 방향 유지한 채로 한칸 후진
        int d = (position + 2) % 4; // 후진(현 방향과 반대방향)
        int bx = x + dx[d];
        int by = y + dy[d];

        if ( bx >= 0 && by >= 0 && bx < n && by < m && map[bx][by] != 1 ) {
            dfs( bx, by, position );
        }
    }
}
