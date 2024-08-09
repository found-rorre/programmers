import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        
        return IntStream.rangeClosed(0, included.length - 1)
                    .map(v -> included[v] ? a + d * v : 0).sum();
    }
}