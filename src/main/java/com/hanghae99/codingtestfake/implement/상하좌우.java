package com.hanghae99.codingtestfake.implement;

import java.util.Scanner;

public class 상하좌우 {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 버퍼 비우기 > 다음 값 입력을 위해 엔터를 친 것이 string 배열에 들어갔기 때문에 해당 구문이 없으면 int만 입력됨
        sc.nextLine();
        String[] position = sc.nextLine().split(" ");
        // 최초 위치 값 선언
        int x = 1;
        int y = 1;

        // L, R, U, D 값 설정
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        String[] type = {"L", "R", "U", "D"};

        // 이동 타입에 따른 이동 거리 계산
        for (int i = 0; i < position.length; i++) {
            // 입력한 이동 계획 확인
            String p = position[i];
            // 이동 후 위치의 값 변수 선언
            int nx = 1;
            int ny = 1;
            // 이동 계획에 맞게 위치 이동
            for (int j = 0; j < 4; j++) {
                // 문자열의 값을 비교할 때는 반드시 equals() 사용 ! 또는 char 자료형을 사용해서 비교연산자 적용하는 것도 방법!
                // char a1 = 'a', char a2 = 97, char a3 = '\u0061' -- a1 == a2 == a3 ( 모두 a라는 문자값 출력 )
                // == 연산자 사용시에는 내용이 같더라도 다른 객체로 인식하기 때문에 false
                if ( p.equals(type[j]) ) {
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }
            // 공간을 벗어나게 될 경우 무시
            // 이동한 위치가 1보다 작거나 공간의 크기(n)보다 클 때
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            x = nx;
            y = ny;
        }
        System.out.println( x + " " + y );
    }
}
