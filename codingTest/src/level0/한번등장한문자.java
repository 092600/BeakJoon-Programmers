package level0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class 한번등장한문자 {
    public static void main(String[] args) {
        solution("hello");
    }

    public static String solution(String s) {
        String result = "";
        List tmp = Arrays.asList(s.split(""));
        for (var e : tmp.stream().filter(val -> Collections.frequency(tmp, val) == 1).sorted().toArray()) {
            result += e;
        }

        // Arrays.toString();
        return "hi";
    }
}