import java.util.Stack;

class Solution {
    public String solution(String my_string) {
        Stack<Character> stack = new Stack();

        char[] chars = my_string.toCharArray();

        for (char c : chars) {
            stack.add(c);
        }

        for (int i = 0; i < chars.length; i++) {
            chars[i] = stack.pop();
        }

        
        return String.valueOf(chars);
    }
}