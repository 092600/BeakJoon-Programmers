package level1;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class 명예의전당 {

    public static void main(String[] args) {
        // int[] score = {10,100,20,150,1,100,200};
        // solution(3, score);
        int[] score = {0,300,40,300,20,70,150,50,500,1000};
        solution(4, score);
    }
    
    public static int[] solution(int k, int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int[] answer = new int[score.length];

        for (int i=0;i<score.length;i++) { 
            queue.add(score[i]);

            if (queue.size() >= k+1) {
                queue.remove(queue.peek());
            }
            answer[i] = queue.peek();
        }

        return answer;
    }
    
}
