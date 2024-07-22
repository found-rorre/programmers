import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        int[] answer = IntStream.range(1, n +1).filter(num -> (num + 1) % 2 == 0).toArray();

        return answer;
    }
}