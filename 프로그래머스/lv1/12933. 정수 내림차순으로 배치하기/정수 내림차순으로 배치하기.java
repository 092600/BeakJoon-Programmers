import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        
        return Long.parseLong(sb.append(Arrays.stream(String.valueOf(n).split("")).sorted().collect(Collectors.joining(sb))).reverse().toString());
    }
}