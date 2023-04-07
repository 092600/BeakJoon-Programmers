package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.IntStream;

public class 짝수는싫어요 {
    public static void main(String[] args) {
        int n = 10;
        // int n = 15;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        List<Integer> lst = new ArrayList<Integer>();
        
        for (int i=1;i<=n;i+=2) {
            lst.add(i);
        }

        return lst.stream().mapToInt(var -> var).toArray();
    }
    
    public static int[] solution2(int n) {
        return IntStream.range(1, n+1).filter(var -> var%2 == 1).toArray();
    }
    
}
