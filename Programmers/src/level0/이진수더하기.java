package level0;

public class 이진수더하기 {

    public static void main(String[] args) {
        solution("10", "11");
    }

    public static String solution(String bin1, String bin2) {
    
        String answer = Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));

        return answer;
    }
    
}
