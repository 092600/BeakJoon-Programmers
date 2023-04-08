package level0;

import java.util.Arrays;

public class 중복된숫자개수 {
    
    public static void main(String[] args) {
        int[] array = {1,1,2,3,4,5};
        // int[] array = {0, 2, 3, 4};
    }

    public static int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(var -> var == n).count();
    }
}
