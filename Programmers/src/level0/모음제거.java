package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 모음제거 {
    public static void main(String[] args) {
        String my_string = "bus";
        // String my_string = "nice to meet you";
        System.out.println(solution2(my_string));
    }

    public static String solution(String my_string) {
        List<String> vowel = Arrays.asList("a", "e", "i", "o", "u");

        return Arrays.stream(my_string.split("")).filter(var -> !vowel.contains(var)).collect(Collectors.joining());
    }

    public static String solution2(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}
