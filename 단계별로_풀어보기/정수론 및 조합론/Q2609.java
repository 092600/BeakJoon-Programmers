//문제
//두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
//
//출력
//첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

import java.io.IOException;
import java.util.Scanner;

public class Q2609 {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);
//
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();


        int GCF = getGCF(a, b);
//
        System.out.println(GCF);
        System.out.print((a * b)/GCF);
    }


    public static int getGCF(int a, int b){
        int r = a % b;

        if (r == 0){
            return b;
        } else{
            return getGCF(b, r);
        }
    }
}
