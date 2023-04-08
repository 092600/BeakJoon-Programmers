package level0;

public class 피자나눠먹기3 {

    public static void main(String[] args) {
        solution(7, 10);
        // solution(, 12);
    }

    public static int solution(int slice, int n) {
        return (int) Math.ceil((double)n/slice);
    }
    
}
