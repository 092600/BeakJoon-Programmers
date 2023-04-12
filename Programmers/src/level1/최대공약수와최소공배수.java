package level1;


public class 최대공약수와최소공배수 {

    public static void main(String[] args) {

        // solution(3, 12);
        solution(2, 5);
    }

    public static int[] solution(int n, int m) {
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
