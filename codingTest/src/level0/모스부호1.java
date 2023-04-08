package level0;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 모스부호1 {
    static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....",
                        "..",".---","-.-",".-..","--","-.","---",".--.",
                        "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        // String letter = ".--. -.-- - .... --- -.";
        solution(letter);
    }

    public static String solution(String letter) {
        String[] letters = letter.split(" ");
        String answer = "";
        
        for (int l=0;l<letters.length;l++) {
            for (int m=0;m<morse.length;m++) {        
                if (morse[m].equals(letters[l])) {
                    char c = (char) (m + 97);
                    answer += Character.toString(c);
                }
            }
        }
        
        return answer;
    }

}
