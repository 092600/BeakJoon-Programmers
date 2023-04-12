package level1;

import java.util.HashMap;
import java.util.Map;

public class 실패율 {

    public static void main(String[] args) {
        // 전체 스테이지의 개수
        // int N = 5; 
        int N = 4; 

        // 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
        // int[] stages = {2,1,2,6,2,4,3,3};
        int[] stages = {4,4,4,4,4};
        
        // 실패율이 높은 스테이지부터 내림차순으로 스테이지 번호가 담긴 배열을 반환
        solution(N, stages);
    }
    
    
    public static int[] solution(int N, int[] stages) {
        Map<Integer, Integer> success = new HashMap<Integer, Integer>();
        Map<Integer, Integer> tryPeo = new HashMap<Integer, Integer>();
        Map<Integer, Double> answerDict = new HashMap<Integer, Double>();
        int[] answer = new int[N];

        for (int i=0;i<stages.length;i++) {
            System.out.print(stages[i] + " | ");
            for (int j=1;j<=stages[i];j++) {
                if (j != N+1)            
                // System.out.print(j + ", ");
                tryPeo.put(j, tryPeo.getOrDefault(j, 0) + 1);
            }
            for (int j=1;j<stages[i];j++) {

                success.put(j, success.getOrDefault(j, 0) + 1);
                System.out.print(j + ", ");
            }
            
            // System.out.println();
        }

        System.out.println(tryPeo);
        System.out.println(success);
        
        for (int round : tryPeo.keySet()) {
            // System.out.println(success.get(round) / tryPeo.get(round));
            // System.out.println((double) 1 - (success.get(round).intValue() / (double) tryPeo.get(round).intValue()));
            answerDict.put(round, (double) 1 - (success.get(round) / (double) tryPeo.get(round)));
        }
        
        
        
        

        System.out.println(answerDict);
        
        // for (int i=0;i<answer.length;i++) {
        //     for (int i=0;i<answer.length;i++) {
        // }

        return stages;
    }
    
}
