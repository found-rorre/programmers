import java.util.HashSet;

class Solution {
    public String solution(String my_string) {
        
        int[] arr = my_string.chars().distinct().toArray();

        return new String(arr, 0, arr.length);
    }
}