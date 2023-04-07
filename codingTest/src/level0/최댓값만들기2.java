package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 최댓값만들기2 {
    public static void main(String[] args) {
        int[] numbers = {1, -5};
        // int[] numbers = {1, 2, -3, 4, -5};
        // int[] numbers = {0, -31, 24, 10, 1, 9};
        // int[] numbers = {10, 20, 30, 5, 5, 20, 5};        
        // int[] numbers = {-10, -20, -30, -5, -5, -20, -5};
        System.out.println(solution(numbers));
    }


    public static int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }


    public static int solution2(int[] numbers) {
        int[] plus = IntStream.of(numbers).filter(var -> var>=0).sorted().toArray();
        int[] minus = IntStream.of(numbers).filter(var -> var<0).sorted().toArray();
        
        return getMaxIntArrays(plus, minus);
    }

    public static int getMaxIntArrays(int[] plus, int[] minus) {
        List<int[]> cases = new ArrayList();
        cases.add(plus); cases.add(minus);

        int MIN_VALUE = Integer.MIN_VALUE; 

        for (int i=0; i<cases.size();i++) {
            for (int j=0; j<cases.size();j++) {
                for (int idx = 0; idx < cases.get(i).length; idx++) {
                    for (int idx2 = 0; idx2 < cases.get(j).length; idx2++) {
                        if (!(i == j && idx == idx2) && (cases.get(i)[idx] * cases.get(j)[idx2] > MIN_VALUE)) {
                            MIN_VALUE = cases.get(i)[idx] * cases.get(j)[idx2++];
                        }
                    }
                }
            }
        }
        

       return MIN_VALUE;
    }
    
}
