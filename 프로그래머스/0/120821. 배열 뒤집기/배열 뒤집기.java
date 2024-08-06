import java.util.Stack;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        Stack<Integer> stack = new Stack();
        IntStream.of(num_list).forEach(stack::push);

        for (int i = 0; i < num_list.length; i++) {
            num_list[i] = stack.pop();
        }
     return num_list;   
    }
}