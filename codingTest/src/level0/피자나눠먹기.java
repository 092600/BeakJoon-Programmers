package level0;

public class 피자나눠먹기 {

    public static void main(String[] args) {
        // int n = 7;
        // int n = 1;
        int n = 15;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        return (int) Math.ceil((double) n / 7);
    }
    
}
