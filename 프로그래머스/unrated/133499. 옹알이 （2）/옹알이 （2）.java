import java.util.*;

class Solution {
    static List<String> originalBabble = List.of("aya", "ye", "woo","ma");
    static List<String> repeatBabble = List.of("ayaaya", "yeye", "woowoo","mama");
    
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (String babble : babbling) {
            boolean isAnswer = true;
            
            for (String repeatBab : repeatBabble) {
                babble = babble.replace(repeatBab, "1");
            }

            for (String ogBab : originalBabble) {
                babble = babble.replace(ogBab, "2");
            }

            if (babble.replaceAll("2", "").length() != 0) {
                isAnswer = false;
            }

            if (isAnswer) {
                answer += 1;
            }
        }

        return answer;
    }
}