package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class K의개수 {

    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
    }

    public static int solution(int i, int j, int k) {
        int cnt = 0;
        for (int start = i; start<=j; start++) {
            int tmp = start;
            while (tmp != 0) {
                if (tmp % 10 == k ) {
                    cnt += 1;
                }
                tmp /= 10;
            }
        }

        return cnt;
    }
    
}
