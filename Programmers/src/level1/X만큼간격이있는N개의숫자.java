package level1;

import java.util.Arrays;
import java.util.stream.LongStream;

public class X만큼간격이있는N개의숫자 {
    public static void main(String[] args) {
        // int x = 2; int n = 5;
        // int x = 4; int n = 3;
        int x = -4; int n = 2;

        System.out.println(Arrays.toString(solution(x, n)));
    }
    
    public static long[] solution(int x, int n) {
        return LongStream.range(0, n).map(var -> var * x + x).toArray();
    }

}
