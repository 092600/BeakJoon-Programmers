package level1;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

public class 같은숫자는싫어 {

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1,0,1};
        System.out.println(Arrays.toString(solution2(arr)));

        // int[] arr = {4,4,4,3,3};
        // System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        String tmpStr = "" + arr[0];
        int tmp = arr[0];
        for (int i=1;i<arr.length;i++) {
            if (tmp != arr[i]) {
                tmpStr += arr[i];
                tmp = arr[i];
            }
        }

        int[] answer = new int[tmpStr.length()];
        String[] tmpArray = tmpStr.split("");

        for (int i=0;i<tmpStr.length();i++) {
            answer[i] = Integer.parseInt(tmpArray[i]);
        }
        return answer;
    }
    
    public static int[] solution2(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(arr[0]);

        for (int i=1;i<arr.length;i++) {
            if (stack.peek() != arr[i]) {
                stack.add(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        for (int i=0;i<stack.size();i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

}
