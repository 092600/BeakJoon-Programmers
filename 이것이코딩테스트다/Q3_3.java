package 이것이코딩테스트다;

import java.util.stream.IntStream;

public class Q3_3 {

    public static void main(String[] args) {
        // int N = 3; int M = 3;
        // int[][] arr = {{3,1,2}, {4,1,4}, {2,2,2}};

        int N = 2; int M = 4;
        int[][] arr = {{7,3,1,8}, {3,3,3,4}};

        System.out.println(solution(N, M, arr));
    }

    public static int solution(int N, int M, int[][] arr) {
        
        int[] tmp = new int[N];

        for (int i=0;i<N;i++) {
            int min = Integer.MAX_VALUE;

            for (int j=0;j<M;j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

            tmp[i] = min;
        }

        return IntStream.of(tmp).max().getAsInt();
    }
    
}
