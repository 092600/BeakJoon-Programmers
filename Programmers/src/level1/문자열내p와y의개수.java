package level1;

public class 문자열내p와y의개수 {

    public static void main(String[] args) {

    }

    boolean solution(String s) {
        int pCnt = 0; int yCnt = 0;
        
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'p') pCnt += 1;
            else if (c == 'y') yCnt += 1;
        }

        return yCnt == pCnt ? true : false;
    }
    
}
