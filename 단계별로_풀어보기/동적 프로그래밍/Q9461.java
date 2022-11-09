import java.util.Scanner;

public class Q9461 {
    public static Long[] dp = new Long[101];
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = stdIn.nextInt();
        
        dp[0] = 0L; dp[1] = 1L; dp[2] = 1L; dp[3] = 1L;
    
        for (int i=0;i<n;i++){
            int in = stdIn.nextInt();
            
            sb.append(solution(in));
            sb.append("\n");
        }
        
        System.out.println(sb);

    }

    public static long solution(int n){
        if (dp[n] == null){
            dp[n] = solution(n-2) + solution(n-3);
        }

        return dp[n];
    }
}
