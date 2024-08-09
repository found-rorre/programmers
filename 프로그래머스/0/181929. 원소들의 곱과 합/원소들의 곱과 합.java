import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        return mul(num_list) < plusToSquare(num_list) ? 1 : 0;
    }
    
    public static int mul(int[] num_list) {
        return IntStream.of(num_list).reduce((a, b) -> a * b).getAsInt();
    }
    
    public static int plusToSquare(int[] num_list) {
        return (int) Math.pow(IntStream.of(num_list).sum() , 2);
    }
}