package level1;

import java.util.Arrays;

public class 하샤드수 {

    public static void main(String[] args) {
        solution(10);
        solution(12);
        solution(11);
        solution(13);
    }

    public static boolean solution(int x) {
        return x % Arrays.stream(String.valueOf(x).split("")).mapToInt(var -> Integer.parseInt(var)).sum() == 0;
    }
    public static boolean solution2(int x) {
        return x % String.valueOf(x).chars().map(ch -> ch - '0').sum() == 0;
    }
    
}
