package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 유한소수판별하기 {

    public static void main(String[] args) {
        System.out.println(solution(7,20));
        System.out.println(solution(11,22));
        System.out.println(solution(12,21));
        // solution(7,20);
        // solution(11,22);
        // solution(12,21);
    }

    public static int solution(int a, int b) {
        int tmp = b/getGcd(a, b);
        return answer(tmp);
    }

    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return getGcd(b, a%b);
    }

    public static int answer(int a) {
        int cnt = (int) IntStream.range(2, a+1)
                                    .filter(var -> (var % 2 != 0))
                                    .filter(var -> var % 5 != 0)
                                    .filter(var -> a % var == 0)
                                    .count();

        return cnt == 0 ? 1 : 2;
    }

}
