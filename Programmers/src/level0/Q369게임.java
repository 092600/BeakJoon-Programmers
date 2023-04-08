package level0;

import java.util.Arrays;

public class Q369게임 {

    public static void main(String[] args) {
        solution(294209);
    }

    public static int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split(""))
                .filter(var -> ((!var.equals("0")) && (Integer.parseInt(var)%3 == 0)))
                .count();
    }
    
}
