package level0;

import java.util.Arrays;
import java.util.List;

public class 영어가싫어요 {

    public static void main(String[] args) {
        solution("onetwothreefourfivesixseveneightnine");

        
    }

    public static void solution(String numbers) {
        String[] lst = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        int cnt = 0;
        for (var e : lst) {
            numbers = numbers.replaceAll(e, String.valueOf(cnt));
            cnt += 1;
        }

        System.out.println(Long.parseLong(numbers));

    }
    
}
