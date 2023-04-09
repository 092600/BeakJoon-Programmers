class Solution {
    public String solution(int n) {
        String[] tmp = {"수", "박"};
        
        if (n % 2 == 0) {
            return (tmp[0] + tmp[1]).repeat(n / 2);
        } else {
            return (tmp[0] + tmp[1]).repeat(n / 2) + tmp[0];
        }
    }
}