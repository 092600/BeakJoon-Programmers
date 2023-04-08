package level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 직각삼각형출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i : IntStream.rangeClosed(1, n).toArray()) {
            System.out.printf("%s \n", "*".repeat(i));
            
        }
    }

}
