package 이것이코딩테스트다;

import java.util.Arrays;
import java.util.Scanner;

public class 왕실의나이트 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        for (int i=0;i<n;i++) {
            int l = stdIn.nextInt();

                
        }
        System.out.println(solution("a1"));
    }

    public static int solution(String position) {
        int answer = 8;
        int x = position.charAt(0) - 97;
        int y = position.charAt(1) - 49;

        

        System.out.println(x+ ", "+ y);

        if (((x <= 0) || (x >= 8)) && ((y <= 0) || (y >= 8))){
            answer -= 6;
        } else if (((x == 1) || (x == 7)) && ((y <= 1) || (y >= 7))) {
            answer -= 4;
        } 

        return answer;
    }
    
}
