package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 안전지대 {

    public static void main(String[] args) {
        int[][] board = {{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        
        solution(board);
    }

    public static int solution(int[][] board) {
        boolean[][] dangerArea = new boolean[5][5];
        
        
        for (int i=0;i<5;i++) {
            for (int j=0;j<5;j++) {

                if (board[i][j] == 1) {
                    
                    int I = (i == 4) || (i == 0) ? i : i-1;
                    int J = (j == 4) || (j == 0) ? j : j-1;
                    
                    // System.out.println(I +", "+J);
                    for ( ;I <= i + 1; I++) {
                        for ( ;J <= j + 1; J++) {
                            System.out.println(I +", "+J);
                            
                        }
                    }
                    
                }
            }
        }
        for (var k : dangerArea) {
            for (var l : k) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        return 3;
    }

    // public static int countShelter(int xIdx, int yIdx) {
       
    // }
}
