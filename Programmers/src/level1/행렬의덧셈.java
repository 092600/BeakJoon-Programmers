package level1;

import java.util.Arrays;

public class 행렬의덧셈 {

    public static void main(String[] args) {
        // int[][] arr1 = {{1,2},{2,3}}; int[][] arr2 = {{3,4},{5,6}};
        int[][] arr1 = {{1},{2}}; int[][] arr2 = {{3},{4}};
        solution(arr1, arr2);
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        for (int i=0;i<arr1.length;i++) {
            for (int j=0;j<arr1[i].length;j++) {
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (var arr : arr1) {
            System.out.println(Arrays.toString(arr));
        }

        return arr1;
    }
    
}
