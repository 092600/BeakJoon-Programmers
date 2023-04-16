import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String[] answer = new String[goal.length]; int i=0;
        int card1Idx = 0; int card2Idx = 0;
        
        for (String card : goal) {

            if (cards1.length != card1Idx) {
                if (cards1[card1Idx].equals(card)) {
                    answer[i++] = card;
                    card1Idx += 1;    
                }
            }    

            if (cards2.length != card2Idx) {
                if (cards2[card2Idx].equals(card)) {
                    answer[i++] = card;
                    card2Idx += 1;   
                }
            }
        }    
        
        return i == goal.length ? "Yes" : "No";
    }
}