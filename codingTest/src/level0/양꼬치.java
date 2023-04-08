package level0;

public class 양꼬치 {
    
    static int nPrice = 12000;
    static int kPrice = 2000;

    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
        // solution(64, 6);
    }

    public static int solution(int n, int k) {
        return nPrice * (n) + kPrice * (k - n/10);
    }
    
}
