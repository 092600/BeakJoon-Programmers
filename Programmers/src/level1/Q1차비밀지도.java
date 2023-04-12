package level1;

import java.util.stream.IntStream;

public class Q1차비밀지도 {

    public static void main(String[] args) {
        // int[] arr1 = {9,20,28,18,11};
        // int[] arr2 = {30,1,21,17,28};
        // solution(5, arr1, arr2);

        int[] arr1 = {46,33,33,22,31, 50};
        int[] arr2 = {27,56,19,14,14,10};
        solution(6, arr1, arr2);
    }
    
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0;i<arr1.length;i++) {
            String[] tmpArr1Data = getArea(Integer.toString(arr1[i],2), n);
            String[] tmpArr2Data = getArea(Integer.toString(arr2[i],2), n);
            String tmp = "";

            for (int j=0;j<arr1.length;j++) {
                
                tmp = (tmpArr1Data[j] + tmpArr2Data[j]).contains("1") ? tmp + "#" : tmp + " ";
                // System.out.print(tmpArr1Data[j] + " "+tmpArr2Data[j] + " " + tmp + " | ");
            }   
            // System.out.println();

            answer[i] = tmp;
        }
        

        return answer;
    }

    public static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0;i<arr1.length;i++) {
            String[] tmpArr1Data = getArea(Integer.toString(arr1[i],2), n);
            String[] tmpArr2Data = getArea(Integer.toString(arr2[i],2), n);
            String tmp = "";

            for (int j=0;j<arr1.length;j++) {
                
                tmp = Integer.parseInt(tmpArr1Data[j] + tmpArr2Data[j]) >= 1 ? tmp + "#" : tmp + " ";
                // System.out.print(tmpArr1Data[j] + " "+tmpArr2Data[j] + " " + tmp + " | ");
            }   
            // System.out.println();

            answer[i] = tmp;
        }
        

        return answer;
    }

    public static String[] getArea(String arr1, int n) {
        int p = n - arr1.length(); 
        String tmp = "";
        for (int i=1;i<=p;i++) {
            tmp += "0";
        }

        return (tmp + arr1).split("");
    }

}
