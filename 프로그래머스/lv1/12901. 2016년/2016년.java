import java.util.stream.IntStream;

class Solution {
    
    static int[] dayCnt = {31,29,31,30,31,30,31,31,30,31,30,31};
    static String[] day = {"FRI","SAT", "SUN","MON","TUE","WED","THU"};
    
    public String solution(int a, int b) {
        int sum = IntStream.range(0, a-1).map(idx -> dayCnt[idx]).sum();

        return day[(sum + b - 1) % 7];
    }
}