package level0;

import java.util.Arrays;

public class 중앙값구하기 {
    public static void main(String[] args)  {
        
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[(array.length-1)/2];
    }
}
