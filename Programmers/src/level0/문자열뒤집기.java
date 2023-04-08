package level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 문자열뒤집기 {

    public static void main(String[] args) {
        String my_string = "jaron";
        // String my_string = "brea";

        solution(my_string);
    }

    public static String solution(String my_string) {
        String answer = ""; String[] tmp = my_string.split("");
        for (int i=my_string.length()-1;i>=0; i--) {
            answer += tmp[i];
        }
        return answer;
    }
}
