package level0;

import java.util.Arrays;

public class 배열의평균값 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println(solution(numbers));
    }

    public static double solution(int[] numbers) {
        double avg = (double) Arrays.stream(numbers).sum() / numbers.length;
        return avg;
    }
    
}
