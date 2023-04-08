package level0;

public class 가위바위보 {
    
    public static void main(String[] args) {
        // String rsp = "2";
        String rsp = "205";

        solution(rsp);
    }

    public static String solution(String rsp) {
        String answer = "";

        for (String tmp : rsp.split("")) {
            answer += tmp.equals("2") ? "0" : tmp.equals("0") ? "5" : "2";
        }
        
        return answer;
    }
}
