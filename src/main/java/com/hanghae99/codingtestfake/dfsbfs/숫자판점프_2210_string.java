package com.hanghae99.codingtestfake.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class 숫자판점프_2210_string {
    static int[][] num;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static ArrayList<String> list;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        num = new int[5][5];
        arr = new int[6]; // 6자리 수 배열

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 1);
            }
        }

        System.out.println(list.size());
    }

    static void dfs(int x, int y, int depth) {
        // 이동 횟수가 6회 미만이면 아래의 구문 수행
        if (depth > 6) {
            // arr 배열에 있는 6자리수 문자열로 변환
            String s = "";
            for (int i = 0; i < arr.length; i++) {
                s += Integer.toString(arr[i]);
            }

            // 리스트에 해당 문자열이 없다면 담아주기(중복 제거)
            // indexOf(): 리스트에 인자가 있으면 인덱스값을, 없으면 -1 리턴
            if (list.indexOf(s) < 0) {
                list.add(s);
            }
            return;
        }

        // depth가 6될때까지 배열 채우기
        arr[depth - 1] = num[x][y];

        // 방향 이동
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 주어진 공간내에서는 전부 dfs 호출
            if (nx >= 0 && ny >= 0 && nx < 5 && ny < 5) {
                dfs(nx, ny, depth + 1);
            }

        }
    }
}

