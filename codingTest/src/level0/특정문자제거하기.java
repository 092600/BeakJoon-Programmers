package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 특정문자제거하기 {
    public static void main(String[] args) {

    }
    
    public static String solution(String my_string, String letter) {
        return Arrays.stream(my_string.split("")).filter(var -> !var.equals(letter)).collect(Collectors.joining());
    }

    public static String solution2(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

}
