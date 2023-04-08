package level0;

import java.util.Arrays;

public class 배열원소의길이 {

    public static void main(String[] args) {
        String[] strlist = {"We", "are", "the", "world!"};
        // String[] strlist = {"I", "Love", "Programmers."};

        System.out.println(solution(strlist));
    }

    public static int[] solution(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(var -> var.length()).toArray();
    }
    
}
