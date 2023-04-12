import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(1, n).filter(var -> n % var == 0) .sum();
    }
}