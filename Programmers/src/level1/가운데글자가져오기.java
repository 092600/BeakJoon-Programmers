package level1;

public class 가운데글자가져오기 {

    public static void main(String[] args) {

    }

    public static String solution(String s) {
        return s.length() % 2 == 0 ? s.substring(s.length()/2-1, s.length()/2+1) : s.substring(s.length()/2, s.length()/2+1);
    }
    
}
