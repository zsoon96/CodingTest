import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 국회의원선거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int me = Integer.parseInt(br.readLine());
        int cnt = 0;

        // 내림차순 정렬
        int[] vote = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            vote[i] = Integer.parseInt(br.readLine());
        }

        // 배열이 비였을 때, stop하고 출력
        if (vote.length == 0) {
            System.out.println(cnt);
            return;
        }

        // 반복문 범위 수정 ( for문으로 하면 뺏어 올수 있는 횟수가 제한됨 )
        while (true) {
            Arrays.sort(vote);
            int max = vote.length - 1;

            if (me <= vote[max]) {
                vote[max]--;
                me++;
                cnt++;
            } else {
                // break 있어야 출력 없으면 무한루프 ^^
                break;
            }
        }
        System.out.println(cnt);
    }
}