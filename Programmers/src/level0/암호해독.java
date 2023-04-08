package level0;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 암호해독 {
    public static void main(String[] args) {
        solution("dfjardstddetckdaccccdegk", 4);
    }

    public static String solution(String cipher, int code) {
        String[] tmp = cipher.split("");
        String answer = IntStream.range(0, tmp.length).filter(idx -> (idx+1)%code == 0).mapToObj(e -> tmp[e]).collect(Collectors.joining());

        return answer;
    }
    
}
