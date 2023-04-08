package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 문자반복출력하기 {

    public static void main(String[] args) {
        solution("hello", 3);
    }

    public static String solution(String my_string, int n) {
        return Arrays.stream(my_string.split("")).map(var -> var.repeat(n)).collect(Collectors.joining());
    }
    
}
