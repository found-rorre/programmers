import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {

        int front = arr.length;
        int end = arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                front = i;
                break;
            }
        }
        
        if (front == arr.length) {
            return new int[] {-1};
        }

        for (int i = arr.length -1;  i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }

        int[] result = Arrays.copyOfRange(arr, front, end + 1);
        
        return result;
    }
}