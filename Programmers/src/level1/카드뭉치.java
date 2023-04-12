package level1;

import java.util.*;


public class 카드뭉치 {

    public static void main(String[] args) {
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};

        String[] goal = {"i", "want", "to", "drink", "water"};

        solution(card1, card2, goal);
    }

    
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1Idx = 0;
        int card2Idx = 0;
        
        String[] answer = new String[goal.length]; int i=0;
        
        for (String card : goal) {
            System.out.println(card1Idx+","+card2Idx+","+i);
            // System.out.println(cards1[card1Idx].equals(card));
            // System.out.println(cards2[card2Idx].equals(card));

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
