import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
		int count = 0;
		for (int[] command : commands) {
			answer[count] = Arrays.stream(array, command[0]-1, command[1])
                            .sorted()
                            .toArray()
                            [command[2] -1]; 
			count++;
		}
        
        return answer;
    }
}