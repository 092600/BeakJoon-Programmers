package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 진료순서정하기 {
    public static void main(String[] args) {
        int[] emergency = {3,76,24};
        // int[] emergency = {1,2,3,4,5,6,7};
        // int[] emergency = {30,10,23,5,100};
        solution(emergency);
    }
        
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for (int i=0;i<emergency.length;i++) {
            int cnt = 1;

            for (int j=0;j<emergency.length;j++) {
                if (emergency[j] > emergency[i]) {
                    cnt ++ ;   
                }   
            }

            answer[i] = cnt;
        }
    
        // System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
