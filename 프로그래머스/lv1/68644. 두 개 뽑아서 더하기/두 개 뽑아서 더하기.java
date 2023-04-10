
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int[] numbers) {
         Set<Integer> answer = new HashSet<Integer>();
        for (int i=0;i<numbers.length-1;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                int tmp = numbers[i] + numbers[j];    
                answer.add(tmp);
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();

    }
}