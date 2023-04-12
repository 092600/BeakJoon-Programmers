class Solution {
    public int solution(String s) {
        if (s.startsWith("-")) {
            return (-1) * Integer.parseInt(s.substring(1));
        }

        return Integer.parseInt(s);
    }
}