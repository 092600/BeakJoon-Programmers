package level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class 두개뽑아서더하기 {

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        // int[] numbers = {5,0,2,7};

        solution(numbers);
    }
    
    public static int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i=0;i<numbers.length-1;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                int tmp = numbers[i] + numbers[j];
                
                if (!answer.contains(tmp)) {
                    answer.add(tmp);
                }
            }
        }
        
        return IntStream.rangeClosed(0, answer.size()-1).map(idx -> answer.get(idx)).sorted().toArray();
    }

    public static int[] solution2(int[] numbers) {
        Set<Integer> answer = new HashSet<Integer>();

        for (int i=0;i<numbers.length-1;i++) {
            for (int j=i+1;j<numbers.length;j++) {
                int tmp = numbers[i] + numbers[j];    
                answer.add(tmp);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }

}
