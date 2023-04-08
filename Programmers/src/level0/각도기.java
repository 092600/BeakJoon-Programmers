package level0;

public class 각도기 {
    
    public static void main(String[] args) {
        // int angle = 70;
        // int angle = 91;
        // int angle = 180;
        solution(70);
        solution(90);
        solution(91);
        solution(180);
    }

    public static int solution(int angle) {
        if (angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle == 180) {
            return 4;
        } else {
            return 3;
        }
    }

}
