import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int near = Integer.MAX_VALUE;
        int result = -1;
        
        Arrays.sort(array);
        
        for (int i : array) {
            System.out.println(i);
        }
        
        

        for (int i = 0; i < array.length; i++) {
            if (near > Math.abs(n - array[i])){
                near = Math.abs(n - array[i]);
                result = array[i];
            }
        }
        return result;
    }
}