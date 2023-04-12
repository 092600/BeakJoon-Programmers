package level1;

public class 푸드파이터대회 {

    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        // int[] food = {1,7,1,2};

        System.out.println(solution(food));
    }
    
    public static String solution(int[] food) {
        String answer = "0";
        
        for (int i=food.length-1;i>=1;i--) {
            for (int j=1;j<=food[i] / 2;j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }

}
