package level0;

import java.util.stream.IntStream;

public class 외계행성의나이 {
    public static void main(String[] args) {
        int n = 23;
        // int n = 51;
        // int n = 100;
        solution(n);
    }

    public static String solution(int age) {
        String answer = "";
        for (String i : String.valueOf(age).split("")) {
            char tmp = (char) (Integer.parseInt(i) + 97);
            answer += String.valueOf(tmp);
        }
        
        return answer;
    }

}
