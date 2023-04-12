package level1;

public class 짝수와홀수 {
    public static void main(String[] args) {
        int n = 3;
        // int n = 4;

        solution(n);
    }

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
