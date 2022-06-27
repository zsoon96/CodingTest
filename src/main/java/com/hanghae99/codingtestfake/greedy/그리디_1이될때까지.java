package com.hanghae99.codingtestfake.greedy;

// 1. n이 k로 나누어 떨어지는 값(t)을 구하고,
// 2. n에서 t를 빼면 n-1 과정의 횟수(cnt)를 구할 수 있음 (n이 k로 나눴을 때 나머지 값)
// 3. n이 k보다 작으면 break, 아니라면 n을 k로 나누어 주고 cnt + 1
// 4. 마지막 남은 수에 대한 cnt - 1

class Solution7 {
    public int solution(int n, int k) {

        int cnt = 0;

        while (true) {
            // 1. N이 K로 나누어 떨어지는 수가 될 때까지 빼주기
            int t = (n / k) * k;
            cnt += n - t;
            n = t;

            // 2. N이 K보다 작으면 break
            if (n < k)
                break;
            // 3. (작지 않다면) N을 K로 나누기
            n /= k;
            cnt += 1;
        }

        // 4. 마지막 남은 수(n==1)로 올라간 cnt 1 빼주기
        cnt -= 1;
        return cnt;
    }

        public static void main (String[]args){
            int n = 17;
            int k = 4;
            Solution7 sol = new Solution7();
            System.out.println(sol.solution(n, k));
        }
    }

