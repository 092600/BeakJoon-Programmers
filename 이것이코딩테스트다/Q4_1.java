package 이것이코딩테스트다;

public class Q4_1 {

    public static void main(String[] args) {
        int N = 5;
        String dirs = "RRRUDD";

        System.out.println(solution(N, dirs));
    }

    public static String solution(int N, String dirs) {
        String[] arr = dirs.split("");
        int x = 1; int y = 1;

        for (String dir : arr) {
            System.out.println(dir);
            switch (dir) {
                case "U":
                    if (x > 1 ) {
                        x -= 1;
                    } 
                    break;
                case "D":
                    if (x < N) {
                        x += 1;
                    }
                    break;
                case "L":
                    if (y > 1) {
                        y -= 1;
                    }
                    break;
                case "R":
                    if (y < N) {
                        y += 1;
                    } 
                    break;
            }
        }

        return x + " " + y;
    }
    
}
