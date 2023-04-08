package level0;

import java.util.Arrays;

public class 인덱스바꾸기 {
    public static void main(String[] args) {
        solution("hello", 1, 2);
    }

    public static String solution(String my_string, int num1, int num2) {
        
        var tmpChatArray = my_string.toCharArray();

        var tmp = tmpChatArray[num1];
        tmpChatArray[num1] = tmpChatArray[num2];
        tmpChatArray[num2] = tmp;

        
        System.out.println(String.valueOf(tmpChatArray));
        
        return "hi";
    }
}
