package com.hanghae99.codingtestfake.implement;

public class 셀프넘버_4673 {
    public static void main (String[] args) {

        boolean [] num = new boolean[10001];

        for ( int i = 1; i <= 10000; i++ ) {
            // 셀프 넘버 아닌 수 n에 담아주기
            int n = check(i);

            // n이 10000보다 작거나 같으면 셀프넘버가 아닌 수 (true)
            if ( n <= 10000 ) {
                num[n] = true;
            }
        }


        // 셀프 넘버 출력
        for ( int i = 1; i <= 10000; i++ ) {
            if ( !num[i] ) {
                System.out.println(i);
            }
        }
    }

    // 셀프 넘버가 아닌 수 구하기
    public static int check(int i) {
        int sum = i;

        while ( i > 0 ) {
            sum += i % 10; // 1의 자리
            i /= 10; // 10으로 나누어 1의 자리 없애기
            // i가 0이 될 때까지 반복
        }
        return sum;
    }
}
