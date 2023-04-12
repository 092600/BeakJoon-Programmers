package level1;

public class 삼총사 {

    public static void main(String[] args) {
        int[] arr = {-2,3,0,2,-5};
        solution(arr);
    }
    
    public static int solution(int[] number) {
        int cnt = 0;
        for (int i=0;i<number.length-2;i++) {
            for (int j=i+1;j<number.length-1;j++) {
                for (int l=j+1;l<number.length;l++) {
                    if ( number[i] + number[j] + number[l] == 0) {
                        cnt ++;
                    }
                }
            }
        }

        return cnt;
    }

}
