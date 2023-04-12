package level1;

public class 콜라츠추측 {
    public static void main(String[] args) {
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        if (num == 1) return 0;
        int answer = 0; long tmp = (long) num;
        
        while (tmp != 1) {
            tmp = (tmp % 2 == 0) ? tmp / 2 : tmp * 3 + 1;
            answer++;

            if (answer >= 500) break;
        }

        answer = answer >= 500 ? -1 : answer;
        return answer;
    }
}
