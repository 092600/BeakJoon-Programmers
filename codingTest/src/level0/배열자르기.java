package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열자르기 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        solution(numbers, 1, 3);

        // int[] numbers = {1,3,5};
        // solution(numbers, 1, 2);
    }
    
    public static int[] solution(int[] numbers, int num1, int num2) {
        IntStream.range(0, numbers.length).filter(idx -> (idx >= num1) && (idx <= num2)).map(idx -> numbers[idx]).toArray();
        return null;
    }

}
