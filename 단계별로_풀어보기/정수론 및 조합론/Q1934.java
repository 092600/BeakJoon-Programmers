//문제
//두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다.
// 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 예를 들어, 6과 15의 공배수는
// 30, 60, 90등이 있으며, 최소 공배수는 30이다.
//
//두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에
// 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
//
//출력
//첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i=0;i<n;i++){
            String tmp = br.readLine();
            String[] tmpSplit = tmp.split(" ");

            int a = Integer.parseInt(tmpSplit[0]);
            int b = Integer.parseInt(tmpSplit[1]);

            int GCF = getGCF(a, b);
            int LCF = a/GCF * b/GCF * GCF;

            System.out.println(LCF);
        }
    }

    public static int getGCF(int a, int b){
        int r = a % b;

        if (r == 0){
            return b;
        } else {
            return getGCF(b, r);
        }
    }
}
