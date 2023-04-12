package level1;

public class 자릿수더하기 {

    public static void main(String[] args) {

    }
    
    public int solution(int n) {
        int answer = 0;
        for (String i : String.valueOf(n).split("")) {
            answer += Integer.parseInt(i);
        }

        return answer;
    }

}
