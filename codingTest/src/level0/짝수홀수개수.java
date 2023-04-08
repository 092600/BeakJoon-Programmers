package level0;

import java.util.stream.IntStream;

public class 짝수홀수개수 {

    public static void main(String[] args) {
        int[] num_list = {1,2,3,4,5};
        // int[] num_list = {1,3,5,7};
    }

    public int[] solution(int[] num_list) {
        int a = (int) IntStream.of(num_list).filter(var -> var % 2 == 0).count();
        int b = (int) IntStream.of(num_list).filter(var -> var % 2 != 0).count();
        int[] answer = {a, b};
        return answer;
    }
    
}
