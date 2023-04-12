package level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 이상한문자만들기 {

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int cnt = 0;

        for (int i=0;i<chars.length;i++) {
            if (chars[i] != ' ') {
                if (cnt % 2 == 0) {
                    System.out.println(Character.toUpperCase(chars[i]));
                    chars[i] = Character.toUpperCase(chars[i]);
                }
                cnt += 1;
            } else {
                cnt = 0;
            }
        }

        return String.valueOf(chars);
    }

    public static String solution2(String s) {
        String answer = ""; 
        String[] arr = s.split(" ");

        for (String a : arr) {
            int cnt = 0;
            
            for (String t : a.split("")) {
                if (cnt % 2 == 1) {
                    answer += Character.toString(Character.toLowerCase(t.charAt(0)));
                } else {
                    answer += Character.toString(Character.toUpperCase(t.charAt(0)));
                }
    
                cnt += 1;
            }

            answer += " ";
        }

        return answer.trim();
    }
    
}
