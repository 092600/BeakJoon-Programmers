package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class 모의고사 {

    public static void main(String[] args) {
        // int[] answer = {1,2,3,4,5};
        int[] answer = {1,3,2,4,2};
        System.out.println(Arrays.toString(solution(answer)));
    }

    public static int[] solution(int[] answers) {
        int p1Cnt = getP1Cnt(answers);
        int p2Cnt = getP2Cnt(answers);
        int p3Cnt = getP3Cnt(answers);

        int[] tmp = {p1Cnt, p2Cnt, p3Cnt};
        int max = IntStream.of(tmp).max().getAsInt();
        return IntStream.rangeClosed(1, tmp.length).filter(idx -> tmp[idx-1] == max).toArray();
    }


    public static int getP1Cnt(int[] answers) {
        return (int) IntStream.range(0, answers.length).filter(idx -> answers[idx] % 5 == ((idx+1) % 5)).count();
    }

    public static int getP2Cnt(int[] answers) {
        int[] tmp = {2,1,2,3,2,4,2,5};
        return (int) IntStream.range(0, answers.length)
            .filter(idx -> answers[idx] == tmp[idx%8])
            .count();
    }
    
    public static int getP3Cnt(int[] answers) {
        int[] tmp = {3,3,1,1,2,2,4,4,5,5};
        return (int) IntStream.range(0, answers.length)
            .filter(idx -> answers[idx] == tmp[idx%10])
            .count();
    }

    public int[] solution2(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
            }
        }

        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++)
            if(max == hit[i]) list.add(i + 1);

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;
    }
    
}
