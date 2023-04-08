package level0;

import java.util.Arrays;

public class Q2차원으로만들기 {
    public static void main(String[] args) {
        // int[] num_list = {1,2,3,4,5,6,7,8};
        // solution(num_list, 2);
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        solution(num_list, 3);
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        for (int i=0;i<num_list.length;i++) {
            answer[i/n][i%n] = num_list[i];
        }

        return answer;
    }

}
