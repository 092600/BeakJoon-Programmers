class Solution {
    public int[] solution(int n, int m) {
        int gcm = getGcm(n, m);
        int[] answer = {gcm, (n * m) / gcm};
        return answer;
    }
    
    public static int getGcm(int a, int b) {
        if (b == 0) {
            return a;
        } 

        return getGcm(b, a%b);
    }
}