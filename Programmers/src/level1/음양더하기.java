package level1;

import java.util.stream.IntStream;

public class 음양더하기 {

    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12}; boolean[] signs = {true, false, true};
        // int[] absolutes = {1, 2, 3}; boolean[] signs = {false, false, true};

        solution(absolutes, signs);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i=0;i<signs.length;i++) {
            answer += absolutes[i] * (signs[i]? 1 : -1);
        }
        return answer;
    }

    public static int solution2(int[] absolutes, boolean[] signs) {
        return IntStream.of(absolutes).sum() + IntStream.range(0, signs.length).filter(idx -> signs[idx] == false).map(idx -> absolutes[idx] * (-1)).sum();
    }
    
}
