package level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        solution2(118372);
    }

    public static long solution(long n) {
        return Long.valueOf(
                Arrays.stream(String.valueOf(n).split(""))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.joining())
            );
    }

    public static long solution2(long n) {
        StringBuilder sb = new StringBuilder();
        
        return Long.parseLong(sb.append(Arrays.stream(String.valueOf(n).split("")).sorted().collect(Collectors.joining(sb))).reverse().toString());
    }
}
