package level0;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class 캐릭터의좌표 {
    public static void main(String[] args) {
        // String[] keyinput = new String[] {"left", "right", "up", "right", "right"};
        // int[] board = new int[]{11,11};
        // String[] keyinput = new String[] {"down", "down", "down", "down", "down"};
        // int[] board = new int[]{7, 9};

        // String[] keyinput = new String[] {"left", "left", "left", "left", "right", "right", "right", "right"};
        // int[] board = new int[]{5, 5};

        String[] keyinput = new String[] {"right", "right", "right", "right","left", "left", "left", "left"};
        int[] board = new int[]{5, 5};
        
        // String[] keyinput = new String[] {"up;", "up", "up", "up","down", "down", "down", "down"};
        // int[] board = new int[]{3, 5};
        

        System.out.println(Arrays.toString(solution(keyinput, board)));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        Map<String, Long> map = Arrays.stream(keyinput).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        int x = 0, y = 0;
        int maxX = (board[0] == 1) ? 0 : (board[0]-1)/2, minX = (board[0] == 1) ? 0 : (-1) * (board[0]-1)/2;
        int maxY = (board[1] == 1) ? 0 : (board[1]-1)/2, minY = (board[1] == 1) ? 0 : (-1) * (board[1]-1)/2;

        for (String key : keyinput) {
                
            if (key.equals("up")) {
                y = (y == maxY) ? y : y+1; 
            } else if (key.equals("down")) {
                y = (y == minY) ? y : y-1;
            } else if (key.equals("left")) {
                x = (x == minX) ? x : x-1;
            } else if (key.equals("right")){
                x = (x == maxX) ? x : x+1; 
            }
        }

        int[] pos = {x, y};
        return pos;
    }
    
}
