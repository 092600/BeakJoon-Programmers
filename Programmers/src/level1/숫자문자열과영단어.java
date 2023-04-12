package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 숫자문자열과영단어 {

    static String[] lst = 
            {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    public static void main(String[] args) {
        solution("one4seveneight");
        solution("23four5six7");
        solution("2three45sixseven");
        solution("123");
    }

    public static int solution(String s) {
        List<String> dict = Arrays.asList(lst);
        String answer = ""; String tmp = "";

        for (int t : s.chars().toArray()) {
            if (!Character.isDigit(t)) {
                tmp += Character.toString(t);

                if (dict.contains(tmp)) {
                    answer += dict.indexOf(tmp);
                    tmp = "";
                }
                
            } else {
                answer += (char)t;

            }
        }

        return Integer.parseInt(answer);
    }
    

    public static int solution2(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i=0; i<10; i++){
            s = s.replaceAll(alphabets[i],digits[i]);
        }

        return Integer.parseInt(s);
    }

}
