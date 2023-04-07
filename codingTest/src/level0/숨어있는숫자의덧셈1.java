package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 숨어있는숫자의덧셈1 {

    public static void main(String[] args) {
        // String my_string = "aAb1B2cC34oOp";
        String my_string = "1a2b3c4d123";
        
        System.out.println(solution(my_string));

    }

    public static int solution(String my_string) {
        return Arrays.stream(my_string.split("")).filter(var -> Character.isDigit(var.toCharArray()[0])).mapToInt(var -> Integer.parseInt(var)).sum();
    }
    
}
