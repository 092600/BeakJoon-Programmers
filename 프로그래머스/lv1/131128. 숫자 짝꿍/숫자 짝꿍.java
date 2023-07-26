class Solution {
    public String solution(String X, String Y) {
        int[] xArr = organize(X);
        int[] yArr = organize(Y);

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int xCnt = xArr[i];
            int yCnt = yArr[i];

            int minCnt = Math.min(xCnt, yCnt);

            sb.append(String.valueOf(i).repeat(minCnt));
        }

        String answer = sb.toString();

        if (answer.isEmpty()) {
            return "-1";
        } else {
            if (answer.matches("^0*$")) {
                return "0";
            } 

            return answer;
        }
    }

    static int[] organize(String e) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};

        for (int i = 0; i < e.length(); i++) {
            int intE = Integer.parseInt(e.substring(i, i+1));

            arr[intE] = arr[intE] + 1;
        }
// 
        return arr;
    }
}