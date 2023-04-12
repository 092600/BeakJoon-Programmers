package level1;

import java.util.stream.IntStream;

public class 약수의합 {

    public static void main(String[] args) {
        int n = 12;
        // int n = 5;

        solution(n);
    }

    public static int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(var -> n%var == 0) .sum();
    }
    
}
