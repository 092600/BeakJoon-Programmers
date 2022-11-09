import java.util.Scanner;

public class Q24416 {
    static int cnt = 0;

    public static int fibonacci(int n){
        if (n==1 || n==2){
            cnt ++;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static int fibonacci_dp(int n) {
        int[] dp = new int[n+1];

        dp[1] = 1;
        dp[2] = 1;
    
        for (int i=3;i<=n;i++){
            cnt ++;
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        
        fibonacci(n);
        System.out.print(cnt + " ");
    
        cnt = 0;

        fibonacci_dp(n);
        System.out.print(cnt);
    }

}
