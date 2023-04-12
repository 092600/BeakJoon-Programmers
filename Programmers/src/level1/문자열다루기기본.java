package level1;

public class 문자열다루기기본 {

    public static void main(String[] args) {
        solution("a234");
        solution("1234");
    }

    public static boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.chars().filter(var -> Character.isDigit(var)).count() == s.length() ? true : false;
        }

        return false;
    }
    
}
