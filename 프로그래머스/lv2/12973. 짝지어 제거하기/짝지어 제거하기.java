import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < c.length; i++) {
            if (stack.size() > 0 && stack.peek() == c[i]) {
                stack.pop();
            } else {
                stack.push(c[i]);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }

}
