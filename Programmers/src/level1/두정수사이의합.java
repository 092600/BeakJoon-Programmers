package level1;

import java.util.stream.IntStream;

public class 두정수사이의합 {

    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
        System.out.println(solution(-5, 3));
        System.out.println(solution(0, 0));
    }

    public static long solution(int a, int b) {
        long answer = 0;
        if (a >= b) {
            for (int i=b;i<=a;i++) {
                answer += i;
            }
            
            return answer;
        } else {
            for (int i=a;i<=b;i++) {
                answer += i;
            }
            
            return answer;
        }
        
    }

    public static long solution2(int a, int b) {
        if (a >= b) {
            return (long) IntStream.rangeClosed(b, a).mapToLong(var -> Long.valueOf(var)).sum();
        } else {
            return (long) IntStream.rangeClosed(a, b).mapToLong(var -> Long.valueOf(var)).sum();
        }
    }
    
}
