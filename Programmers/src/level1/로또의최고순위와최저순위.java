package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class 로또의최고순위와최저순위 {

    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        solution(lottos, win_nums);
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] correctNums = IntStream.range(0, 6).filter(idx -> lottos[idx] != 0).map(idx -> lottos[idx]).toArray();
        int zeroCnt = (int) IntStream.range(0, 6).filter(idx -> lottos[idx] == 0).count();
        System.out.println(Arrays.toString(correctNums));
        int cnt = 0;
        for (int num : correctNums) {
            for (int n : win_nums) {
                if (num == n) {
                    cnt ++;
                }
            }
        }

        int[] answer = {getRank(cnt, zeroCnt), getRank(cnt, 0)};
        return answer;
    }

    public static int[] solution2(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }


        int sameCount = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }

    
    public static int getRank(int cnt, int zeroCnt) {
        switch (cnt+zeroCnt) {
            case 0:
                return 6;
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            
            default:
                return 1;

        }
    }
    
}
