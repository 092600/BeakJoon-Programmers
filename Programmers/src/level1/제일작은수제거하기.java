package level1;


import java.util.stream.IntStream;

public class 제일작은수제거하기 {

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        solution(arr);
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }

        int min = IntStream.of(arr).min().getAsInt();

        int[] answer = new int[arr.length-1]; int i = 0;
        for (int e : arr) {
            if (e == min) {
                continue;
            }
            answer[i] = e;
            i++;
        }

        return answer;
        
    }
}
