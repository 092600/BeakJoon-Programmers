import java.util.Scanner;

public class Q11051 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        int[][] solution = getSolution(n, k);
        System.out.println(solution[n][k]);

    }

    private static int[][] getSolution(int n, int k){
        int[][] solution = new int[n+1][n+1];

        for (int i=0;i<n+1;i++){
            solution[i][i] = 1;
            solution[i][0] = 1;
        }

        for (int i=1;i<n+1;i++){
            for (int j=1;j<n+1;j++){
                solution[i][j] = (solution[i-1][j-1] + solution[i-1][j])%10007;
            }
        }

        return solution;
    }
}
