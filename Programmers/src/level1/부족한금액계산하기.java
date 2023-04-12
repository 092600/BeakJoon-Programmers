package level1;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class 부족한금액계산하기 {
    
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
        long answer = LongStream.rangeClosed(1, count).map(var -> Long.valueOf(price * var)).sum() - money;
        return answer < 0 ? 0 : answer;
    }

    public int getPrice(int price, int money, int count) {
        if (money >= price) {
        }

        return price * (count + 1);
    }

}
