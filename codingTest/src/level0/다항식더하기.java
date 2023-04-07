package level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 다항식더하기 {

    public static void main(String[] args) {
        System.out.println(solution("8 + 2 + x"));
        // System.out.println(solution("3x + 7 + x"));
    }

    public static String solution(String polynomial) {
        String[] polynomialArray = polynomial.split(" ");
        List<String> tmp = Arrays.stream(polynomialArray).filter(var -> !var.contains("+")).collect(Collectors.toList());

        int constantSum = 0, xSum = 0;
        for (String e : tmp) {
            if (e.contains("x")) {
                int val = e.split("x").length == 0 ? 1 : Integer.parseInt(e.split("x")[0]);
                xSum += val;
            } else {
                constantSum += Integer.parseInt(e);
            }
        }
        
        String xVal = xSum == 0 ? "" : xSum == 1 ? "x" : xSum + "x";
        String cVal = constantSum == 0 ? "" :  xSum == 0 ? String.valueOf(constantSum) : " + " + constantSum;
    
        return xVal + cVal;
    }
    
}
