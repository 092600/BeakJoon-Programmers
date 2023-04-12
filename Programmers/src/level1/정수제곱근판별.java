package level1;

public class 정수제곱근판별 {

    public static void main(String[] args) {
        solution(121);
        solution(3);
    }

    public static long solution(long n) {
        if (n % Math.sqrt(n) == 0) {
            return (long) Math.pow(Math.sqrt(n)+1, 2);
        } else {
            return -1;
        }
    }
    
}
