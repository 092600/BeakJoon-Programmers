package level1;

public class 수박수박수박수박수박수 {
    
    public static void main(String[] args) {
        solution(3);
        solution(4);
    }

    public static String solution(int n) {
        if (n % 2 == 0) {
            return ("수박").repeat(n / 2);
        } else {
            return ("수박").repeat(n / 2) + "수";
        }
    }
}
