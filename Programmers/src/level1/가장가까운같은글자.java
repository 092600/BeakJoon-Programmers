package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 가장가까운같은글자 {

    public static void main(String[] args) {
        // String s = "banana";
        String s = "foobar";

        solution(s);
    }
    
    public static int[] solution(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String[] tmp = s.split(""); 
        int[] answer = new int[tmp.length];
        
        for (int i=0;i<tmp.length;i++) {
            if (!map.containsKey(tmp[i])) {
                answer[i] = -1;
                map.put(tmp[i], i);
            } else {
                answer[i] = i - map.get(tmp[i]).intValue();
                map.replace(tmp[i], i);
            }
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
