import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
       int[] a = Arrays.copyOfRange(arr,intervals[0][0], intervals[0][1] + 1);
        int[] b = Arrays.copyOfRange(arr,intervals[1][0], intervals[1][1] + 1);

        int[] result = new int[a.length + b.length];
        int idx = 0;
        
        for (int i = 0; i < a.length; i++) {
            result[idx++] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            result[idx++] = b[i];
        }

        return result;
    }
}