package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 가까운수 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, -3, -2, -1};
        System.out.println(solution(array, 0));
    }

    public static int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;

        Arrays.sort(array);
        
        for (int i=0;i<array.length;i++) {
            int abs = Math.abs(array[i] - n);
            if (abs < min) {
                min = abs;
                answer = array[i];
            
                
            }
        }

        return answer;
    }


    
}
