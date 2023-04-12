package level1;

public class 콜라문제 {

    public static void main(String[] args) {
        System.out.println(solution(2, 1, 20));
        System.out.println(solution(3, 1, 20));
    }

    // 마트에 줘야하는 병 수 : a
    // 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수  : b
    // 상빈이가 가지고 있는 빈 병의 개수 : n
    public static int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            answer += b * (n / a);
            n = n % a + b * (n / a);
        }

        return answer;
    }
    
}
