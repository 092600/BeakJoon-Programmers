import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1676 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        if (n == 0){
            System.out.println(0);
        } else {
            Map<Integer, Integer> solutionMap = getFactorial(n);

            int result = (solutionMap.get(2) >= solutionMap.get(5)) ? solutionMap.get(5) : solutionMap.get(2);
            System.out.println(result);
        }


    }

    public static Map<Integer, Integer> getFactorial(int n){
        Map<Integer, Integer> solutionMap = new HashMap<Integer, Integer>();

        for (int i=2;i<=n;i++){
            Map<Integer,Integer> tmpMap = getPrimeFactorization(i);
            solutionMap.put(2, tmpMap.getOrDefault(2, 0)+solutionMap.getOrDefault(2,0));
            solutionMap.put(5, tmpMap.getOrDefault(5, 0)+solutionMap.getOrDefault(5,0));
        }


        return solutionMap;
    }

    public static Map<Integer, Integer> getPrimeFactorization(int n){
        Map<Integer, Integer> primeFactorizationMap = new HashMap<Integer, Integer>();

        for (int i=2;i<=5;i++){
            while(n%i == 0){
                primeFactorizationMap.put(i, primeFactorizationMap.getOrDefault(i, 0)+1);
                n /= i;
            }
        }
        return primeFactorizationMap;
    }
}
