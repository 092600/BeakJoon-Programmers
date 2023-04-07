package level0;

import java.util.Arrays;

public class 문자열정렬하기1 {
    public static void main(String[] args) {
        // String my_string = "hi12392";
        // String my_string = "p2o4i8gj2";
        String my_string = "abcde0";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    public static int[] solution(String my_string) {
        return my_string.chars().filter(var -> Character.isDigit(var)).map(var -> var - 48).sorted().toArray();
    }
}
