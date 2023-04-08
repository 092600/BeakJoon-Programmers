package level0;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    public static void main(String[] args) {

    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}
