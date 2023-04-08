import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        long n = Long.valueOf(inputs[0]);
        long m = Long.valueOf(inputs[1]);

        int cnt2 = getPrimeFactorizationOf2(n) - getPrimeFactorizationOf2(m) - getPrimeFactorizationOf2(n-m);
        int cnt5 = getPrimeFactorizationOf5(n) - getPrimeFactorizationOf5(m) - getPrimeFactorizationOf5(n-m);

        System.out.println(Math.min(cnt2, cnt5));
    }

    public static int getPrimeFactorizationOf2(long n){
        int cnt = 0;
        while(n >= 2){
            cnt += n/2;
            n /= 2;
        }

        return cnt;
    }

    public static int getPrimeFactorizationOf5(long n){
        int cnt = 0;
        while(n >= 5){
            cnt += n/5;
            n /= 5;
        }

        return cnt;
    }

}
