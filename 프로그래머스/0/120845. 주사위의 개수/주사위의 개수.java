import java.util.stream.IntStream;

class Solution {
    public int solution(int[] box, int n) {
        
        return IntStream.of(box).reduce(1, (a, b) -> a * (b / n));
    }
}