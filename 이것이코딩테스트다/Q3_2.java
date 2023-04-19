package 이것이코딩테스트다;

import java.util.Arrays;

public class Q3_2 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,4,6};
        solution(5,8,3,arr);
    }

    public static int solution(int N, int M, int K, int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[N-1] * (K * (M / K)) + arr[N-2] * (int)(M % K));
        return 3;
    }


    
}
