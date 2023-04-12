package level1;

import java.util.stream.IntStream;

public class Q2016년 {

    static int[] dayCnt = {31,29,31,30,31,30,31,31,30,31,30,31};
    static String[] day = {"FRI","SAT", "SUN","MON","TUE","WED","THU"};
    public static void main(String[] args) {
        // System.out.println(solution(5, 24));
        System.out.println(solution(2, 1));
    }

    public static String solution(int a, int b) {
        int sum = IntStream.range(0, a-1).map(idx -> dayCnt[idx]).sum();

        // System.out.println("sum" + sum);
        return day[(sum + b - 1) % 7];
    }
    
}
