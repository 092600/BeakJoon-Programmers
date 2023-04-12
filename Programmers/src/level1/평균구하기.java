package level1;

import java.util.stream.IntStream;

public class 평균구하기 {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4};
        // int[] arr = {5, 5};
    }
    
    public double solution(int[] arr) {
        return IntStream.of(arr).average().getAsDouble();
    }

}
