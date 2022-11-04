import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class Q1010 {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int[][] solution = getSolution();

        int cnt = stdIn.nextInt();
        for (int i=0;i<cnt;i++){
            int n = stdIn.nextInt();
            int m = stdIn.nextInt();

            System.out.println(solution[m][n]);
        }

    }

    public static int[][] getSolution(){
        int[][] solution = new int[30][30];

        // 2번 성질 (n == r, r == 0)
        for (int i = 0; i < 30; i++) {
            solution[i][i] = 1;
            solution[i][0] = 1;
        }


        for (int i = 2; i < 30; i++) {
            for (int j = 1; j < 30; j++) {
                // 1번 성질
                solution[i][j] = solution[i - 1][j - 1] + solution[i - 1][j];
            }
        }

        return solution;
    }
}
