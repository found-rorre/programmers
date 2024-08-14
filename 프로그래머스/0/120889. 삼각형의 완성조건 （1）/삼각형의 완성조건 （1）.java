import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt();

        return max < (Arrays.stream(sides).sum() - max) ? 1 : 2;
    }
}