package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 등수매기기 {

    public static void main(String[] args) {
        int[][] score = {{89, 78}, {77, 90}, {40,70}, {50, 80}, {50, 65}};
        // int[][] score = {{80, 70}, {70, 80}, {30,50}, {90, 100}, {100, 90}, {100,100}, {10,30}};
        System.out.println(Arrays.toString(solution(score)));
    }

    public static int[] solution(int[][] score) {
        double[] rank = new double[score.length];
        for (int i=0;i<score.length;i++) {
            rank[i] = (double)( score[i][0] + score[i][1])/2;
        }

        int[] answer = new int[score.length];
        for (int i=0;i<rank.length;i++) {
            int rnk = 1;

            for (var j : rank) {
                if (rank[i] < j) {
                    rnk++;
                }
            }

            answer[i] = rnk;
        }
        
        return answer;
    }
}
