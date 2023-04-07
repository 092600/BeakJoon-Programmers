package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 안전지대 {

    public static void main(String[] args) {
        // int[][] board = {{1, 0, 0, 0, 1}, {0, 0, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 1}, {0, 0, 0, 0, 0}};
        // int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        // int[][] board = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}};
        // int[][] board = {{0}};
        // int[][] board = {{0, 0}, {0,0}};
        int[][] board = {{1, 0, 0}, {0,0,0},{0,0,1}};
        
        System.out.println(solution(board));
    }

    public static int solution(int[][] board) {
        int n = board.length; int answer = 0;
        boolean[][] dangerArea = new boolean[n][n];
        
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (board[i][j] == 1) {
                    
                    int I = (i == 0) ?  Integer.valueOf(i) : Integer.valueOf(i-1);
                    int J = (j == 0) ?  Integer.valueOf(j) : Integer.valueOf(j-1);

                    int endI = (i == n-1) ? i : i+1;
                    int endJ = (j == n-1) ? j : j+1;
                    
                    for (int y = I ;y <= endI; y++) {
                        for (int x = J ;x <= endJ; x++) {
                            dangerArea[y][x] = true;
                        }   
                    }            
                }
            }
        }
        
        for (var k : dangerArea) {
            for (var l : k) {
                if (l == false) {
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
}
