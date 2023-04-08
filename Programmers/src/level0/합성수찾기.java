package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 합성수찾기 {

    public static void main(String[] args) {
        // int n = 10;
        int n = 15;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i=3; i <= n; i++) {
            int cnt = 0;
            
            for (int j=1;j<=i;j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }

            answer = cnt >= 3 ? answer += 1 : answer;
        }

        return answer;
    }
    
}
