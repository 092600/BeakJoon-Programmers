package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import javax.xml.transform.SourceLocator;

public class 소인수분해 {
    
    public static void main(String[] args) {
        int n = 12;
        // int n = 17;
        // int n = 420;
        System.out.println(solution(n));
    }

    public static int[] solution(int n) {
        Set<Integer> set = new HashSet();

        int k = 2;
        while(n != 1) {
            if (n % k == 0) {
                set.add(k);
                n /= k;
            } else {
                k++;
            }
        }

        System.out.println(set);
        int[] answer = new int[set.size()];
        int i=0;
        for (int var : set) {
            answer[i++] = var;
        }

        Arrays.sort(answer);
        return answer;
    }
}
