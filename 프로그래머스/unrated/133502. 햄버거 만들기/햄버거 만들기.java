import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> ingredients = new Stack<Integer>();
        int answer = 0;

        for (int ingr : ingredient) {
            ingredients.push(ingr);

            if (ingredients.size() >= 4) {
                int size = ingredients.size();
                
                if ((ingredients.get(size-4) == 1) && (ingredients.get(size-3) == 2) && (ingredients.get(size-2) == 3) && (ingredients.get(size-1) == 1)) {
                    
                    for (int i = 0; i < 4; i++) {
                        ingredients.pop();
                    }

                    answer += 1;
                }
            }
        }

        return answer;
    }
}