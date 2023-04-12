package level1;

public class 약수의개수와덧셈 {

    public static void main(String[] args) {
        System.out.println(solution(13, 17));
        System.out.println(solution(24, 27));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            int cnt = 0;
            for (int j=1; j <= i; j++) {
                if (i % j == 0) { 
                    cnt++;
                }
            }

            answer = (cnt % 2 == 0) ? answer + i : answer - i; 
        }

        return answer;
    }
    
    public int solution2(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }

}
