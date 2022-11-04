import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] lst = new int[n];

        String[] inputs =  br.readLine().split(" ");

        for (int i=0;i<n;i++){
            // r * 2
            lst[i] = Integer.parseInt(inputs[i]) * 2;
        }

        int fstVal = lst[0];
        for (int i=1;i<n;i++){
            int gcd = gcd(fstVal, lst[i]);
            System.out.println(fstVal/gcd + "/" + lst[i]/gcd);
        }
    }

    static int gcd(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
