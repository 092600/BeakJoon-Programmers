package level1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(long n) {
        String[] tmp = String.valueOf(n).split("");
        int[] arr = new int[tmp.length];

        for (int i=tmp.length-1;i>=0;i--) {
            arr[tmp.length - 1 - i] = Integer.parseInt(tmp[i]);
        }

        return arr;
    }
    
    public static int[] solution2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }

}
