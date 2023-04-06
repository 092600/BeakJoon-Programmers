package level0;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class 중복된문자제거 {
    public static void main(String[] args) {
        solution("people");
    }

    public static String solution(String my_string) {
        List<String> arr = Arrays.asList(my_string.split(""));
            
        String resultStr = "";
        for (String i : arr) {
            if ((arr.indexOf(i) != arr.lastIndexOf(i) && !resultStr.contains(i)) || (arr.indexOf(i) == arr.lastIndexOf(i))) {
                resultStr += i;
            }
        }
        
        return resultStr;
    }

    public static String solution2(String my_string) {
        return my_string.chars().mapToObj(Character::toString).distinct().collect(Collectors.joining(my_string));
    }

    public static String solution3(String my_string) {
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(my_string.split("")));
        return String.join("", set);
    }
    
}
