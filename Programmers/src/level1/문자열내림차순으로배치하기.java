package level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class 문자열내림차순으로배치하기 {

    public static void main(String[] args) {
        solution("Zbcdefg");
    }

    public static String solution(String s) {
        return Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
    }
    
}
