import java.util.stream.LongStream;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = LongStream.rangeClosed(1, count).map(var -> Long.valueOf(price * var)).sum() - money;
        return answer < 0 ? 0 : answer;
    }
}