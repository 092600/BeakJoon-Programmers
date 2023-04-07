package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 숨어있는숫자의덧셈2 {

    public static void main(String[] args) {
        System.out.println(solution("zzz111"));
    }

    public static int solution(String my_string) {
        int answer = 0;

        String tmp = "";
        char[] my_char = my_string.toCharArray();
        
        for (int i=0;i<my_char.length;i++) {
            if (Character.isDigit(my_char[i])) {
                tmp += String.valueOf(my_char[i]);
            } else {
                if (tmp != "") {
                    System.out.println("b"+i);
                    answer += Integer.valueOf(tmp);
                }

                tmp = "";
            }

            if (i == my_char.length-1 && tmp != "") {
                answer += Integer.valueOf(tmp);
            }
        }

        return answer;
    }
    
    public int solution2(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }

}
