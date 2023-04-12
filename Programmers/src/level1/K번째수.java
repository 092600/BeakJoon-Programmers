package level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class K번째수 {
    public static void main(String[] args) {

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        solution(array, commands);
    }
    
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int l=0; l<commands.length; l++) {
            int i = commands[l][0] - 1;
            int j = commands[l][1] - 1;
            int k = commands[l][2] - 1;

            int[] arr = IntStream.rangeClosed(i, j).map(idx -> array[idx]).sorted().toArray();
            answer[l] = arr[k];
        }

        return array;
    }
    
}
