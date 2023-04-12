package level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 예산 {

    public static void main(String[] args) {
        // int[] d = {1,3,2,5,4};
        int[] d = {2,2,3,3};

        System.out.println(solution(d, 10));
    }

    public static int solution(int[] d, int budget) {
        Arrays.sort(d); int answer = 0;
        
        for (int t : d) {
            if (budget - t >= 0) {
                budget -= t;
            }
            answer += 1;
        }

        return answer;
    }
    
}
