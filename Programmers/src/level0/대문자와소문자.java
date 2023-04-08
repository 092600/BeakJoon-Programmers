package level0;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class 대문자와소문자 {
    public static void main(String[] args) {
        solution("cccCCC");
    }

    public static String solution(String my_string) {
        String answer = "";
        char[] tmp = my_string.toCharArray();
        
        for (int i=0;i<tmp.length;i++) {
            if (!Character.isUpperCase(tmp[i]))  {
                tmp[i] = Character.toUpperCase(tmp[i]);
            } else {
                tmp[i] = Character.toLowerCase(tmp[i]);
            }
        }

        System.out.println(String.valueOf(tmp));
        return "";
        
        
    }
}
