package level1;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {

    }

    public String solution(String[] seoul) {
        int i = 0;
        for (String var : seoul) {
            
            if (var.equals("Kim")) {
                return "김서방은 "+(i+1)+"에 있다";
            }
            i++;
        }

        return null;
    } 
}
