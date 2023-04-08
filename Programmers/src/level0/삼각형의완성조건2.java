package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 삼각형의완성조건2 {

    public static void main(String[] args) {
        int[] sides = {3, 6};
        solution(sides);
    }

    public static int solution(int[] sides) {
        int answer = 0;
        
        int maxIdx = sides[0] > sides[1] ? 0 : 1;
        int minIdx = sides.length - maxIdx - 1;

        answer += IntStream.range(1, sides[maxIdx]+1).filter(var -> var + sides[minIdx] > sides[maxIdx]).count();
        answer += IntStream.range(sides[maxIdx]+1, sides[maxIdx]+sides[minIdx]).count();

        return answer;
    }
    
}
