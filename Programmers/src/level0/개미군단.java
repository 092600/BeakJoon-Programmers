package level0;

public class 개미군단 {

    public static void main(String[] args) {
        // int hp = 23;
        // int hp = 24;
        int hp = 999;

        solution(hp);
    }

    public static int solution(int hp) {
        int answer = 0;
        
        answer += hp / 5; hp %= 5;
        answer += hp / 3; hp %= 3;
        answer += hp;
        
        return answer;
    }
    
}
