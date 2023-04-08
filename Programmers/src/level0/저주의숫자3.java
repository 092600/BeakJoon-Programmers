package level0;

public class 저주의숫자3 {
    
    public static void main(String[] args) {
        solution(15);
    }
    public static int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            answer += 1;

            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer += 1;
            } 
        }
        
        return answer;
    }
}
