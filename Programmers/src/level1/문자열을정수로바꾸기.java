package level1;

public class 문자열을정수로바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("+1234"));
        // System.out.println(solution("-1234"));
    }

    public static int solution(String s) {
        System.out.println('0');
        return Integer.parseInt(s);
    }

    public static int solution2(String str) {
        boolean Sign = true;
            int result = 0;

      for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '-')
                    Sign = false;
                else if(ch !='+')
                    result = result * 10 + (ch - '0');
            }
            return Sign?1:-1 * result;
    }
    
}
