package com.hanghae99.codingtestfake.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지1이될때까지 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 0;

        // 수의 범위가 적을 때 방법 ( 1이 될때까지 나머지가 있으면 빼주고 + 나머지가 없으면 나눠주기 )
//        while ( n > 1 ) {
//            // 나머지가 있으면
//            if ( n%k != 0 ) {
//                n -= 1;
//                cnt++;
//            }
//            // 나머지가 없으면
//            else if ( n%k == 0 ) {
//                n /= k;
//                cnt++;
//            }
//        }

        // 수의 범위가 클 때 효과적인 방법 (빼줘야하는 횟수를 한번에 구하고 + 나눠주는 횟수)
        while (true) {
            // 빼줘야하는 횟수를 구하기 위해
            // 두 입력값을 나누고 다시 k를 곱해주면, n의 값에서 나누어 떨어지는 수를 찾을 수 있음
            // 그래서 n에서 그 만큼을 빼주면 -1해줘야 하는 횟수 구할 수 있음
            int minus = (n/k) * k;
            cnt += ( n - minus );
            n = minus;

            // n이 k보다 작아서 (더 이상 나눌 수 없을 때) 반복문 종료
            if ( n < k ) {
                break;
            }
            // 아니면 n / k
            cnt += 1;
            n /= k;
        }
        // 마지막 n < k 경우, minus 값이 0이 나오기 때문에 cnt +1 되서 결과적으로 맨 마지막에 -1 해줘야함...
        cnt += n-1;
        System.out.println(cnt);
    }
}
