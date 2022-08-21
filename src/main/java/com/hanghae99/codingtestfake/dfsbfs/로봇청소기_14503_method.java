package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 로봇청소기_14503_method {
    static int[][] map;
    static boolean[][] visited;
    static int n, m, d;
    static int[][] position = {{-1,0}, {0,1}, {1,0}, {0,-1}};
    static int cnt = 0;
    static RC curr = new RC(0,0);

    static class RC {
        int r, c;

        public RC(int r, int c) {
            super();
            this.r = r;
            this.c = c;
        }

        @Override
        public String toString() {
            return "RC [r=" + r + ", c=" + c + "]";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        curr.r = Integer.parseInt(st.nextToken());
        curr.c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for ( int i = 0; i < n; i++ ) {
            st = new StringTokenizer(br.readLine());
            for ( int j = 0; j < m; j++ ) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[curr.r][curr.c] = true; // 현재 위치 청소

        while(true) {
            cnt++; // 청소 영역 + 1
            while ( move1() ) { // 2-1
                if ( move2() ) { // 2-2
                    if ( move3() ) { // 2-3
                        System.out.println(cnt); // 2-4
                        return;
                    }
                }
            }
        }
    }

    // 왼쪽 방향에 아직 청소하지 않은 공간이 있다면, 그 방향으로 회전한 다음 한칸 전진하고 1번부터 진행
    static boolean move1() {
        int dir = (d + 3) % 4; // 왼쪽 방향부터
        int nr = curr.r + position[dir][0];
        int nc = curr.c + position[dir][1];

        if ( !visited[nr][nc] && isIn(nr,nc) && map[nr][nc]==0 ) {
            visited[nr][nc] = true; // 청소
            // 왼쪽 위치, 방향을 현재 위치, 방향으로 바꿔주기
            curr.r = nr;
            curr.c = nc;
            d = dir;
            // 1로 되돌아가야하기 때문에 다음 수행문을 진행하지 않음
            return false;
        }
        // 청소할 수 없다면, 다음 수행문 진행
        return true;
    }

    // 왼쪽 방향에 청소할 공간이 없다면, 그 방향으로 회전하고 2번(2-1)으로 돌아감
    static boolean move2() {
        int dir = d;
        int r = curr.r;
        int c = curr.c;

        for ( int i = 0; i < 4; i++ ) {
            dir = (dir+3) % 4;
            int nr = r + position[dir][0];
            int nc = c + position[dir][1];
            // 4방향을 돌면서 청소할 곳이 있으면, 다음 수행문으로 진행 못함
            if ( isIn(nr, nc) && map[nr][nc]==0 && !visited[nr][nc] ) {
                return false;
            }
            // 청소할 곳이 없으면 회전
            d = dir;
        }
        // 4방향 모두 청소할 공간이 없으면, 다음 수행문 진행
        return true;
    }

    // 4방향 모두 청소가 되어있거나 벽인 경우, 바라보는 방향을 유지한 채 한칸 후진 후 2번(2-1)으로 돌아감
    static boolean move3() {
        int dir = (d+2) % 4; // 후진 시, 방향
        int nr = curr.r + position[dir][0];
        int nc = curr.c + position[dir][1];
        // 벽이 아니고, 주어진 공간안에 있으면 후진해서 다시 2-1로 돌아감
        if ( isIn(nr, nc) && map[nr][nc]==0 ) {
            curr.r = nr;
            curr.c = nc;
            return false;
        }
        // 후진할 수 없다면, 다음 수행문 진행
        return true;
    }

    static boolean isIn(int x, int y) {
        return x >= 0 && x < n && y >=0 && y < m;
    }
}
