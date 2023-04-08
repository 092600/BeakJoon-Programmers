import java.util.Scanner;

public class Q11050 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        System.out.println(factorialAMinusB(a,b)/factorial(b));
    }

    static int factorialAMinusB(int a, int b){
        int tmp = 1;

        for (int i=a;i>a-b;i--){
            tmp *= i;
        }

        return tmp;
    }

    static int factorial(int b){
        int tmp = 1;

        for (int i=1;i<=b;i++){
            tmp *= i;
        }

        return tmp;
    }
}
