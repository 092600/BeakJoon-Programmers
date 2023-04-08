package level0;

public class 점의위치구하기 {
    public static void main(String[] args) {
        int[] dot = {2, 4};
        solution(dot);
    }

    public static int solution(int[] dot) {
        int x = dot[0];
        int y = dot[1];

        if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y < 0) {
            return 3;
        } else if (x < 0 && y > 0) {
            return 2;
        } else {
            return 4;
        }
    }
}
