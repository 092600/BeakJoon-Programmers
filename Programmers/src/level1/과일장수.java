package level1;

import java.util.Arrays;

public class 과일장수 {

    public static void main(String[] args) {
        // 이윤이 가장 높은 경우는 
        // 가장 높은 점수의 사과를 많은 상자에 하나씩

        // int k = 3; // k :최대 점수
        // int m = 4; // m : 한 상자에 들어가는 사과의 수
        // int[] score = {1,2,3,1,2,3,1};

        int k = 4; // k :최대 점수
        int m = 3; // m : 한 상자에 들어가는 사과의 수
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        solution(k, m, score);
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0; Arrays.sort(score); 

        for (int i=score.length-1;i>=score.length%m;i -= m) {
            answer += score[i-m+1] * m;
        }
        
        return answer;
    }
    
}
