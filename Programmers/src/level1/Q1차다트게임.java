package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q1차다트게임 {
    public static void main(String[] args) {
        // String dartResult = "1S2D*3T";
        String dartResult = "1D2S#10S";
        // String dartResult = "1S*2T*3S#";
        // String dartResult = "1D2S0T";
        
        solution(dartResult);
    }

    public static int solution(String dartResult) {
        int[] tmp = dartResult.chars().toArray();
        int[] idxArray = IntStream.range(0, tmp.length).filter(idx -> (tmp[idx] >= 68 && tmp[idx] <= 84)).toArray();
        int[] awardArray = IntStream.range(0, tmp.length).filter(idx -> (tmp[idx] == 42 || tmp[idx] == 35)).toArray();
        
        
        for (int idx : idxArray) {
            System.out.println(idx);
            if (tmp[idx+1] == 35 || tmp[idx+1] == 42) {

            }
        }
        
        System.out.println(Arrays.toString(idxArray));
        System.out.println(Arrays.toString(awardArray));


        System.out.println((int)'#');
        System.out.println((int)'*');
        // System.out.println((int)'S');
        // System.out.println((int)'D');
        // System.out.println((int)'T');

        return 0;
    }
}
