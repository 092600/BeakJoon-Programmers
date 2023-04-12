package level1;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class 소수찾기 {

    public static void main(String[] args) {
       System.out.println(solution2(10));
    //    System.out.println(solution(5));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i=2;i<n;i++) {
            boolean isAvailable = true;

            innerFor:
            for (int j=2; j<=Math.sqrt(i);j++) {
                // System.out.println(j);
                if (n % j == 0) {
                    System.out.println(j);
                    isAvailable = false;
                    break innerFor;
                }
            }
            
            if (isAvailable) answer +=1 ;
        }
        
        return answer;
    }

    public static int solution2(int n) {
        int answer = 0;
        for (int i=2;i<=n;i++) {
            
            boolean isAvailable = true;

            innerFor:
            for (int j=2;j<=Math.sqrt(i);j++) {    

                if (i % j == 0){
                    isAvailable = false;
                    break innerFor;
                }
            }
            
            if (isAvailable) answer++;
        }
        
        return answer;
    }
    
}
