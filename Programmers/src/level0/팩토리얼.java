package level0;

import java.util.stream.IntStream;

public class 팩토리얼 {

    public static void main(String[] args) {
        int n = 3628801;
        // int n = 7;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        
        for (int i=0;i<=10;i++) {
            if ((factorial(i) <= n) && (factorial(i + 1) > n)) {
                return i;
            }
        }
        
        return 0;
    }
    

    public static int factorial(int num) {
        if ((num == 0) || (num == 1)) {
            return 1;
        }

        // return 3;
        return num * factorial(num-1);
    }

    public static int solution2(int n) {
        int fac = 1;
        int i = 0;

        while(true){
            if(fac <= n){
                fac *= i + 1;
                i++;
            }else break;
        }

        return i-1;
    }
}
