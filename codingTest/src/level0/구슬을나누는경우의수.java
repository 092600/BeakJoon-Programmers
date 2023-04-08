package level0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 구슬을나누는경우의수 {

    public static void main(String[] args) {
        // int balls = 3;
        // int share = 2;
        int balls = 30;
        int share = 16;
        // int balls = 5;
        // int share = 5;
        System.out.println(solution(balls, share));
    }

    public static int solution(int balls, int share) {
        return combination(balls, share);
    }

    public static int combination(int balls, int share) {
        if (balls == share || share == 0) return 1;
        return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
    }

}
