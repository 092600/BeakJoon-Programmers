import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testN = Integer.parseInt(br.readLine());

        for (int i=0;i<testN;i++){
            Map<String, Integer> solutionMap = new HashMap<String, Integer>();
            int n = Integer.parseInt(br.readLine());

            for (int j=0;j<n;j++){
                String[] inputs = br.readLine().split(" ");
                solutionMap.put(inputs[1], solutionMap.getOrDefault(inputs[1], 0)+1);
            }

            int result = 1;
            for(String key : solutionMap.keySet()){
                result *= solutionMap.get(key)+1;
            }

            System.out.println(result-1);
        }
    }
}
