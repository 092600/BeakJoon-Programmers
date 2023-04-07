package level0;

import java.util.Arrays;

public class 머쓱이보다키큰사람 {
    
    public static void main(String[] args) {
        int[] array = {149, 180, 192, 170};
        solution(array, 167);
    }

    public static int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(var -> var > height).count();
    }

}
