package 이것이코딩테스트다;

public class Q4_2 {

    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int N) {
        int answer = 0;

        for (int h=0; h<=N ;h++) {
            for (int m=0; m<=59 ;m++) {
                for (int s=0; s<=59 ;s++) {
                    if ((h + "" + m + s).contains("3")) {
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }
    
}
