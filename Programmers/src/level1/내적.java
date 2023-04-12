package level1;

import java.util.stream.IntStream;

public class 내적 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4}; int[] b = {-3,-1,0,2};
        // int[] a = {-1,0,1}; int[] b = {1,0,-1};
        
        solution(a, b);
    }

    public static int solution(int[] a, int[] b) {
        return IntStream.range(0, a.length).map(idx -> a[idx] * b[idx]).sum();
    }
    
}
