package level0;

import java.util.stream.IntStream;

public class 짝수의합 {

    public static void main(String[] args) {
        int n = 10;
        // int n = 4;

        solution(n);
    }

    public static int solution(int n) {
        return IntStream.range(1, n+1).filter(var -> var%2 == 0).sum();
    }
    
}
