package level1;

import java.util.stream.IntStream;

public class 나머지가1이되는수찾기 {

    public static void main(String[] args) {
        int n = 10;
        solution(n);
    }

    public static int solution(int n) {
        return IntStream.range(2, n).filter(var -> n % var == 1).toArray()[0];
    }
    
}
