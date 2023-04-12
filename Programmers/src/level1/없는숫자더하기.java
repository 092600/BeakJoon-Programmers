package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 없는숫자더하기 {

    public static void main(String[] args) {
        // System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
        // System.out.println(solution(new int[]{0,1,2,3,4,6,7,8,9}));
        // System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
        // System.out.println(solution(new int[]{9}));
        // System.out.println(solution(new int[]{9,8}));
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
    }

    // public static int solution(int[] numbers) {
    //     int[] lst = {0,1,2,3,4,5,6,7,8,9};
    //     int answer = (45) * numbers.length;

    //     for (int j=0;j<lst.length;j++) {
    //         for (int num : numbers) {
    //             if (lst[j] != num) {
    //                 answer -= lst[j];
    //             } 
    //         }
    //         // System.out.println();
    //     }
        
    //     return answer;
    // }

    public static int solution(int[] numbers) {
        List<int[]> lst = Arrays.asList(numbers);
    
        return 45 - IntStream.of(numbers).filter(e -> !lst.contains(e)).sum();
    }

}
