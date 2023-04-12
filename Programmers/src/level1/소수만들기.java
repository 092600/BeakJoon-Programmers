package level1;

public class 소수만들기 {

    public static void main(String[] args) {
        // int[] nums = {1,2,3,4};
        int[] nums = {1,2,7,6,4};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i=0;i<nums.length-2;i++) {
            for (int j=i+1;j<nums.length-1;j++) {
                for (int l=j+1;l<nums.length;l++) {
                    int tmp = nums[i] + nums[j] + nums[l];
                    boolean isAvailable = true;

                    testFor:
                    for (int t=2;t<=Math.sqrt(tmp);t++) {
                        if (tmp % t == 0) {
                            isAvailable = false;
                            break testFor;
                        }
                    }

                    if (isAvailable) answer += 1;
                }
            }
            
        }

        return answer;
    }
    
}
