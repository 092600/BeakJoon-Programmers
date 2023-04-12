package level1;


public class 시저암호 {
    public static void main(String[] args) {
        System.out.println(solution("a B z", 4));
        System.out.println(solution("AB", 25));
        System.out.println(solution("z", 1));
    }

    public static String solution2(String s, int n) {
        int[] tmp =  s.chars().toArray();
        String answer = "";

        for (int t : tmp) {
            if (Character.isLowerCase(t)) {
                answer += Character.toString((char) (((t + n) - 97) % 26 + 97));
            } else if (Character.isUpperCase(t)) {
                answer += Character.toString((char) (((t + n) - 65) % 26 + 65));

            } else {
                answer += " ";
            }
            
        }
        
        return answer;
    }
    public static String solution(String s, int n) {
        int[] tmp =  s.chars().toArray();
        String answer = "";
        
        for (int t : tmp) {
            if (Character.isLowerCase(t)) {
                answer += Character.toString((t - 'a') % 26 + 'a');
            } else if (Character.isUpperCase(t)) {
                answer += Character.toString(( t - 'A') % 26 + 'A');
            } else {
                answer += " ";
            }
        }
        
        return answer;
    }
    
}
