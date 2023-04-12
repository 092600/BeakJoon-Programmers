package level1;

import java.util.Arrays;
import java.util.Comparator;

public class 최소직사각형 {

    public static void main(String[] args) {
        // int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        // int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        solution(sizes);
    }

    public static int solution(int[][] sizes) {
        int idx1Max = 0;
        for (int[] size : sizes) {
            
            if (size[0] < size[1]) {
                int tmp = size[0];
                size[0] = size[1];
                size[1] = tmp;
            }

            idx1Max = idx1Max < size[1] ? size[1] : idx1Max;
        }
        
        Arrays.sort(sizes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });
        
        return sizes[sizes.length-1][0] * idx1Max;
    }

    


    
}
