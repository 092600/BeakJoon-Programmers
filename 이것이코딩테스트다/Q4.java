package 이것이코딩테스트다;

public class Q4 {
    public static void main(String[] args) {
        System.out.println(solution(25, 5));
    }

    public static int solution(int N, int K) {
        int answer = 0;
        while(N != 1) {
            if (N % K == 0) {
                N /= K;
            } else {
                N -= 1;
            }
            answer += 1;
        }

        return answer;
    }
    
}
