class Solution {
    public String solution(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int cnt = 0;

        for (int i=0;i<chars.length;i++) {
            if (chars[i] != ' ') {
                if (cnt % 2 == 0) {
                    System.out.println(Character.toUpperCase(chars[i]));
                    chars[i] = Character.toUpperCase(chars[i]);
                }
                cnt += 1;
            } else {
                cnt = 0;
            }
        }

        return String.valueOf(chars);
    }
}