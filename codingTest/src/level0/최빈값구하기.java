package level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class 최빈값구하기 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 4,4,4};
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        Map<Integer, Integer> tmp = Arrays.stream(array).boxed()
                                        .collect(Collectors.groupingBy(e -> e, Collectors.reducing(0, e -> 1, Integer::sum)));
        
        int cnt = 0; int[] answer = new int[tmp.size()];
        int cntMax = (int) tmp.values().stream().max(Comparator.naturalOrder()).get();
        
        for (var t : tmp.entrySet()) {
            if (t.getValue() == cntMax) {
                answer[cnt++] = t.getKey();
            }
        }

        return cnt == 1 ? answer[0] : -1;
    }
    
}
