package level0;

public class 직사각형넓이구하기 {

    public static void main(String[] args) {
        // int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] dots = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};        

        System.out.println(solution(dots));
    }

    public static int solution(int[][] dots) {
        int MAX_VALUE_OF_X = Integer.MIN_VALUE; int MIN_VALUE_OF_X = Integer.MAX_VALUE;
        int MAX_VALUE_OF_Y = Integer.MIN_VALUE; int MIN_VALUE_OF_Y = Integer.MAX_VALUE;

        for (int[] dot : dots) {
            MAX_VALUE_OF_X = (dot[0] > MAX_VALUE_OF_X) ? dot[0] : MAX_VALUE_OF_X;
            MIN_VALUE_OF_X = (dot[0] < MIN_VALUE_OF_X) ? dot[0] : MIN_VALUE_OF_X;

            MAX_VALUE_OF_Y = (dot[1] > MAX_VALUE_OF_Y) ? dot[1] : MAX_VALUE_OF_Y;
            MIN_VALUE_OF_Y = (dot[1] < MIN_VALUE_OF_Y) ? dot[1] : MIN_VALUE_OF_Y;
        }

        return (MAX_VALUE_OF_X - MIN_VALUE_OF_X) * (MAX_VALUE_OF_Y - MIN_VALUE_OF_Y);
    }
    
}
