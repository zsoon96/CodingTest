package com.hanghae99.codingtestfake.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 덩치_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int [][] person = new int[n][2];
        // String [] str;

        for ( int i = 0; i < n; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            // str = br.readLine().split(" ");
            person[i][0] = Integer.parseInt(st.nextToken()); // 몸무게
            person[i][1] = Integer.parseInt(st.nextToken()); // 키
        }

        // 2차원 배열 출력
        // System.out.println(Arrays.deepToString(person));

        for ( int i = 0; i < n; i++ ) {
            int rank = 1;

            // 같은 사람은 제외
            for ( int j = 0; j < n; j ++ ) {
                // System.out.println(Arrays.toString(person[i]));
                // System.out.println(Arrays.toString(person[j]));
                if ( i == j ) {
                    continue;
                }

                // i가 j번째 사람보다 키와 몸무게 모두 작으면 rank + 1
                if ( person[i][0] < person[j][0] && person[i][1] < person[j][1] ) {
                    rank ++;
                }
            }
            System.out.print( rank + " ");
        }
    }
}
