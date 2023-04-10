import java.util.Arrays;

class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        for (int i=1;i<food.length;i++) {
            // System.out.println(food[i]);
            for (int j=1;j<=food[i] / 2;j++) {
                answer += i;
                sb.append(i);
            }
        }

        answer += "0"; answer += sb.reverse();
        return answer;
    }
}