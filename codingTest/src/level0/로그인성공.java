package level0;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 로그인성공 {

    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(solution(id_pw, db));
    }

    public static String solution(String[] id_pw, String[][] db) {
        
        for (String[] user : db) {
            if (user[0].equals(id_pw[0])) {
                if (user[1].equals(id_pw[1])) {
                    return "login";
                }
                return "wrong pw";
            }

        }
    
        return "fail";
    }
}
