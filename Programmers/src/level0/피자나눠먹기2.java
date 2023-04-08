package level0;

public class 피자나눠먹기2 {

    public static void main(String[] args) {
        // int n = 6;
        int n = 10;
        // int n = 4;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int cnt = 1;
        while (true) {
            if ((6 * cnt) % n == 0) {
                break;
            }

            cnt += 1;
        }
        
        return cnt;
    }

}
