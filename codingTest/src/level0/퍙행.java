package level0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 퍙행 {

    public static void main(String[] args) {
        // int[][] dots = {{1,4}, {9,2}, {3,8}, {11,6}};
        int[][] dots = {{3,5}, {4,1}, {2,4}, {5,10}};
        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        int[] dot = dots[0];

        for (int j=1;j<dots.length;j++) {
            double m1 = (double) (dot[1] - dots[j][1]) / (double) (dot[0] - dots[j][0]);
            double m2 = getM2(j, dots);
            
            System.out.println(m1 +", "+ m2);
            
            if (m1 == m2) { 
                return 1;
            }
        }
            
        return 0;
    }
    
    public static double getM2(int j, int[][] dots) {
        switch (j) {
            case 1:
                return (double) (dots[3][1] - dots[2][1])/ (double) (dots[3][0] - dots[2][0]);
                
            case 2:
                return (double) (dots[3][1] - dots[1][1]) / (double) (dots[3][0] - dots[1][0]);

            case 3:
                return (double) (dots[2][1] - dots[1][1]) / (double) (dots[2][0] - dots[1][0]);
            
            default:
                return 0;
        }
    }
}
