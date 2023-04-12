package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        Map<Integer,Double> map2 = new HashMap<Integer,Double>();
        List<Double> arr = new ArrayList<Double>();

        for (int i=0;i<=N;i++) {
            map.put(i, 0);
        }

        for (int stage : stages) {
            for (int i=0;i<stage;i++) {
                map.put(i,map.getOrDefault(i, 0)+1);
            }
        }

        for (int i=1;i<=N;i++) {
            map2.put(i, (double) map.get(i) / map.get(i-1));
        }
    
        Iterator<Double> iter = map2.values().iterator();
        while(iter.hasNext()) {
            arr.add(iter.next());
        }

        Collections.sort(arr);

        int[] answer = new int[arr.size()];
        for (int i=0;i<arr.size();i++) {
            for (Integer key : map2.keySet()) {
                if (map2.get(key) == arr.get(i)) {
                    answer[i] = key;
                }
            }
        }
        
        return answer;
    }
    
}

// for (int stage : stages) {
        //     for (int i=1;i<stage;i++) {
        //         map2.put(i, (double) map.get(i) / map.get(i-1));
        //     }    
        // }