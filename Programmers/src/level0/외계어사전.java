package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 외계어사전 {
    
    public static void main(String[] args) {
        // String[] spell = {"p", "o", "s"};
        // String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        // solution(spell, dic);
        System.out.println(solution(spell, dic));
    }

    public static int solution(String[] spell, String[] dic) {
        for (var e : dic) {
            boolean answer = true;

            for (var s : spell) {
                if (!e.contains(s)) {
                    answer = false;
                }
            }

            if ((answer) & (e.length() == spell.length)) {
                return 1;
            }
        }

        return 2;
    }
}
