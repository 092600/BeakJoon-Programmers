package level0;

import java.util.HashMap;
import java.util.Map;

public class 겹치는선분의길이 {
    public static void main(String[] args) {
        // int[][] lines = {{-1,1}, {1,3}, {3,9}};
        // int[][] lines = {{0,1}, {2,5}, {3,9}};
        int[][] lines = {{0,5}, {3,9}, {1,10}};
        solution(lines);
    }

    public static int solution(int[][] lines) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (var line : lines) {
            for (int i=line[0];i<line[1];i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        
        for (Integer val : map.values()) {
            if (val >= 2) {
                answer += 1;
            }
        }

        return answer;
    }
    
}
