import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d); int answer = 0;
        
        for (int t : d) {
            if (budget - t >= 0) {
                budget -= t;
                answer += 1;
            }
        }

        return answer;
    }
}