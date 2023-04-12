package level1;

import java.util.HashMap;
import java.util.Map;

public class 폰켓몬 {

    public static void main(String[] args) {
        // int[] nums = {3,1,2,3};
        // int[] nums = {3,3,3,2,2,4};
        int[] nums = {3,3,3,2,2,2};
        
        solution(nums);
    }

    public static int solution(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n,0)+1);
        }

        if (nums.length / 2 < map.keySet().size()) {
            // System.out.print("nums.length / 2 >= map.keySet().size()  ");
            return nums.length / 2;
        } else {
            // System.out.println("nums.length / 2 < map.keySet().size()");
            System.out.println(map.keySet().size());
            return map.keySet().size();
        }
    }
    
}
