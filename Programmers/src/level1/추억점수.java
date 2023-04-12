package level1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class 추억점수 {

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};

        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        // solution(name, yearning, photo);
        System.out.println(Arrays.toString(solution(name, yearning, photo)));
        // System.out.println(photo.length);
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i=0;i<photo.length;i++) {
            int tmp = 0;
            for (int j=0;j<photo[i].length;j++) {
                

                for (int l=0;l<name.length;l++) {
                    if (photo[i][j].equals(name[l])) {
                        tmp += yearning[l];
                    }
                }
            }

            answer[i] = tmp;
        }
        
        return answer;
    }


}