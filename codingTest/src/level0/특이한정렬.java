package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 특이한정렬 {

    public static void main(String[] args) {
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        solution(numlist, 30);
    }

    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        int i=0;
        for (var e : Arrays.stream(numlist)
                        .mapToObj(val -> Math.abs(val-n-0.1))
                        .sorted()
                        .collect(Collectors.toList())) {
                            
            if (String.valueOf(e).indexOf(".1") != -1){
                answer[i++] = (int) Math.abs(e - 0.1 - n);
            } else {
                answer[i++] = (int) (e+0.1 +n);
            }
        }

        
        return answer;
    }
    
}
