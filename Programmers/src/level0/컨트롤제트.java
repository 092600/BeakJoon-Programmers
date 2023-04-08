package level0;

public class 컨트롤제트 {

    public static void main(String[] args) {
        String str = "1 2 Z 3";
        System.out.println(solution(str));
    }

    public static int solution(String s) {
        String[] tmp = s.split(" ");
        int answer = 0;

        for (int i=0;i<tmp.length;i++) {
            if (tmp[i].equals("Z")) {
                answer -= Integer.parseInt(tmp[i-1]);
            } else {
                answer += Integer.parseInt(tmp[i]);
            }
        }
        return answer;
    }
}
