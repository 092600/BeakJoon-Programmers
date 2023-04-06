package level0;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A로B로만들기 {

    public static void main(String[] args) {
        solution("olleh", "hello");
    }

    public static int solution(String before, String after) {
        var beforeMap = Arrays.stream(before.split(""))
            .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
            
        var afterMap = Arrays.stream(after.split(""))
            .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        
        int answer = beforeMap.entrySet().equals(afterMap.entrySet()) ? 1 : 0;

        return answer;
    }

    public static int solution2(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
    
}
