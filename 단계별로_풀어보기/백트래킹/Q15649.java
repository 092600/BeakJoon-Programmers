import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q15649 {
    public static StringBuilder sb = new StringBuilder();
    public static int n, m;
    public static boolean[] visit;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        visit = new boolean[n];
        arr = new int[m];
        dfs(0);
        System.out.println(sb);
    }

    private static void dfs(int depth) {
        if (depth == m) {
            for (int val : arr) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}

class Q15649InProperWay{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        Q15649.n = stdIn.nextInt();
        Q15649.m = stdIn.nextInt();
        Map<String, Boolean> nMap = new HashMap<String, Boolean>();

        for (int i=1;i<=Q15649.n;i++){
            nMap.put(String.valueOf(i), true);
        }

        int minNum = (int) Math.pow(10,Q15649.m-1);
        int maxNum = (int) (Q15649.n * Math.pow(10, Q15649.m-1) + Q15649.n * Math.pow(10, Q15649.m-2));

        for (int i=minNum;i<=maxNum;i++){
            String strVal = String.valueOf(i);
            String[] strValList = strVal.split("");
            Map<String, Boolean> testMap = new HashMap<String, Boolean>();


            InnerFor:
            for (int j=0;j< strValList.length;j++){
                if (nMap.containsKey(strValList[j])){
                    if (!testMap.containsKey(strValList[j])){
                        testMap.put(strValList[j], true);
                    }
                } else {
                    break InnerFor;
                }
            }

            if (testMap.keySet().size() == strValList.length){
                for (String s : strValList){
                    Q15649.sb.append(s + " ");
                }
                Q15649.sb.append("\n");
            }

            System.out.println(Q15649.sb);
        }

    }
}

