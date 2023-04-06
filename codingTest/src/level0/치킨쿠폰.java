package level0;

public class 치킨쿠폰 {

    public static void main(String[] args) {
        solution(1081);
    }

    public static int solution(int chicken) {
        int answer = 0;
        int tmp = chicken % 10;        
    
        while (chicken > 0) {
            chicken /= 10;
            answer += chicken;
            tmp += chicken % 10;
        }

        while (tmp > 0) {
            tmp /= 10;
            answer += tmp;
        }

        return answer;
    }
    
}
