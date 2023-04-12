class Solution {
    public boolean solution(String s) {
        if (s.length() == 4 || s.length() == 6) {
            return s.chars().filter(var -> Character.isDigit(var)).count() == s.length() ? true : false;
        }

        return false;
    }
}