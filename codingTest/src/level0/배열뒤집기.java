package level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class 배열뒤집기 {
    
    public static void main(String[] args) {
        int[] num_list = {1, 0, 1, 1, 1, 3, 5};
        solution(num_list);
    }

    public static int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len];
        
        for (int i=0;i<len;i++) {
            answer[i] = num_list[len-i-1];
        }

        return answer;
    }


}
