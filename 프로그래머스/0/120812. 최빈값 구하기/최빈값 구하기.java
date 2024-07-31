import java.util.HashMap;
import java.util.stream.IntStream;


class Solution {
    public int solution(int[] array) {
        int answer= -1;
        HashMap<Integer, Integer> hm = new HashMap();

        IntStream.of(array).forEach(n -> hm.merge(n, 1, Integer::sum));
        int max = hm.values().stream().mapToInt(Integer::intValue).max().getAsInt();

        int count = 0;
        for (int key : hm.keySet()){
            if (hm.get(key) == max){
                count++;
                answer = key;
            }
        }
        
        return count == 1 ? answer : -1;
    }
}