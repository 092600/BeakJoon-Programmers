package level1;

public class Q3진법뒤집기 {

    public static void main(String[] args) {
        solution(45);
        solution(125);
    }
    
    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(n, 3)).reverse();
        return Integer.valueOf(String.valueOf(sb),3);
    }

}
