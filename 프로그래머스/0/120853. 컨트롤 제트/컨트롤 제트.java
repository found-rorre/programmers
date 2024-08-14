import java.util.Arrays;

class Solution {
    public int solution(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                arr[i] = "0";
                arr[i - 1] = "0";
            }
        }

        return Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
    }
}