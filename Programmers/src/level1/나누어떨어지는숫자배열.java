package level1;

import java.util.stream.IntStream;

public class 나누어떨어지는숫자배열 {

    public static void main(String[] args) {

    }

    public int[] solution(int[] arr, int divisor) {
        int[] answer = IntStream.of(arr).filter(var -> var % divisor == 0).sorted().toArray();
        return answer.length == 0 ? new int[]{-1} :  answer;
    }
    
}
