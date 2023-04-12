package level1;


public class 크기가작은부분문자열 {

    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));

    }
    
    public static int solution(String t, String p) {
        int answer = 0;
        
        for (int i=0;i<=t.length()-p.length();i++) {
            long tmp = Long.parseLong(t.substring(i, i+p.length()));

            if (tmp <= Long.parseLong(p)) { 
                answer += 1;
            }
        
        }

        return answer;
    }

}
