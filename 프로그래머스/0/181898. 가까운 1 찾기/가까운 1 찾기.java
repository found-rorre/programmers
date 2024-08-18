import java.util.Arrays;

class Solution {
    public int solution(int[] arr, int idx) {
        
        int[] copy = Arrays.copyOfRange(arr, idx, arr.length);
        
        for (int i = 0; i < copy.length; i++) {
            if (copy[i] == 1) {
                return i + idx;
            }
        }
        
        return -1;
    }
}