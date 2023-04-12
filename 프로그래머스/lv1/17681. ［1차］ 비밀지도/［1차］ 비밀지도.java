class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0;i<arr1.length;i++) {
            String[] tmpArr1Data = getArea(Integer.toString(arr1[i],2), n);
            String[] tmpArr2Data = getArea(Integer.toString(arr2[i],2), n);
            String tmp = "";

            for (int j=0;j<arr1.length;j++) {
                tmp = (tmpArr1Data[j] + tmpArr2Data[j]).contains("1") ? tmp + "#" : tmp + " ";
            }   

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