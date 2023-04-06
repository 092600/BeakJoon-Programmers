package level0;

import java.util.ArrayList;
import java.util.List;

public class 유한소수판별하기 {

    public static void main(String[] args) {
        System.out.println(solution(7,20));
    }

    public static int solution(int a, int b) {
        int gcd = getGcd(a, b);
        System.out.println(gcd);
        
        List divisors = getDivisor(b/gcd);

        int tmp = (int) divisors.get(divisors.size()-1);

        System.out.println(tmp);

        // if ((tmp.contains(2) && tmp.contains(5)) && tmp.size() == 2) {
        //     return 1;
        // }

        return 2;
    }

    public static int getGcd(int a, int b) {
        if (b==0) {
            return a;
        } 

        return getGcd(b, a%b);
    }
    
    public static List getDivisor(int num) {
        List divisors = new ArrayList();

        for (int i=1;i<=num; i++) {
            if (num%i == 0) {
                num /= i;
                divisors.add(i);
            }
        }
        return divisors;
    }

}
