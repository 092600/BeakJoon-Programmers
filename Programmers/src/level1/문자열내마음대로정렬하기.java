package level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {

    public static void main(String[] args) {
        // String[] strings = {"sun", "bed", "car"};
        String[] strings = {"abcd", "abce", "cdx"};

        solution(strings, 2);
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.charAt(n) != o2.charAt(n) ? o1.charAt(n) - o2.charAt(n) : o1.compareTo(o2);
            }
            
        });

        System.out.println(strings[0].compareTo(strings[1]) + " | " + strings[1].compareTo(strings[2]));
        return strings;
    }
    
}
