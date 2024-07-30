import java.util.stream.IntStream;

class Solution {
    public int solution(int[] array) {
        array = IntStream.of(array).sorted().toArray();
        
        
        
        return array[array.length / 2];
    }
}