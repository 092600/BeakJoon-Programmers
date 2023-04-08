package level0;

public class 치킨쿠폰 {

    public static void main(String[] args) {
        System.out.println(solution(1081));
        System.out.println(solution(100));
        // solution(1081);
        // solution(100);
    }

    public static int solution(int chicken) {
        // System.out.println(getChicken(chicken, 1,  0) - chicken);

        int answer = 0;

        while (chicken >= 10) {
            answer += Integer.valueOf(chicken / 10);
            chicken = chicken / 10 + chicken % 10;
        }

        return answer;
    }
    
    public static int getChicken(int chicken, int depth, int answer) {
        System.out.printf("chicken : %s, depth : %s, answer : %s", chicken, depth, answer);
        System.out.println();

        if (chicken == 0) {
            return 0;
        }
        
        if (chicken >= 10) {
            answer += chicken;
            getChicken(chicken % 10 + chicken / 10, ++ depth, answer);
        } 
        
        return answer;
    }

}
