class Solution {
    boolean solution(String s) {
        int pCnt = 0; int yCnt = 0;
        
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') pCnt += 1;
            else if (c == 'y') yCnt += 1;
        }

        return yCnt == pCnt ? true : false;
    }
}