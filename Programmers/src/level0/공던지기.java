package level0;

public class 공던지기 {

    public static void main(String[] args) {
        // int[] numbers = {1, 2, 3, 4};
        int[] numbers = {1, 2, 3, 4, 5};
        // int[] numbers = {1, 2, 3};
        solution(numbers, 1 );
        solution(numbers, 2 );
        solution(numbers, 3 );
        solution(numbers, 4 );
        solution(numbers, 5 );
        solution(numbers, 6 );
        solution(numbers, 7 );
        solution(numbers, 8 );
        solution(numbers, 9 );
        solution(numbers, 10 );
        solution(numbers, 11 );
        solution(numbers, 12 );
        solution(numbers, 13 );
        solution(numbers, 14 );
    }

    public static int solution(int[] numbers, int k) {
        int idx = (2 * (k-1))% numbers.length;   
        return numbers[idx];
    }
    
}
