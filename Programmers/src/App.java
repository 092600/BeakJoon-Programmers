
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 1, 2, 3, 1};
        // int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution(12345));
    }

    public static int solution2(int[] ingredient) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int ing : ingredient) {
            map.put(ing, map.getOrDefault(ing, 0) + 1);
        }

        return map.values().stream().min(Comparator.naturalOrder()).get();
    }

    public static int solution3(int[] ingredient) {
        String tmp = ""; int answer = 0;

        for (int i=0;i<ingredient.length;i++) {
            tmp += ingredient[i];
        }

        tmp.replaceAll(".*1231.*", "-");
        System.out.println(tmp);
        return tmp.split("-").length - 1;
    }

    public static int[] solution(int n) {
        String[] tmp = String.valueOf(n).split("");
        int[] answer = new int[tmp.length];

        for (int i=tmp.length-1;i>=0;i--) {
            answer[tmp.length - 1 - i] = Integer.parseInt(tmp[i]);
        }

        return answer;

    }
}
