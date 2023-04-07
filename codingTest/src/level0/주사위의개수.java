package level0;

public class 주사위의개수 {

    public static void main(String[] args) {
        // int[] box = {1,1,1};
        int[] box = {10,8,6};
        System.out.println(solution(box, 3));
    }

    public static int solution(int[] box, int n) {
        int a = box[1] / n;
        int b = box[2] / n;
        int h = box[0] / n;

        return a * b * h;
    }
    
}
