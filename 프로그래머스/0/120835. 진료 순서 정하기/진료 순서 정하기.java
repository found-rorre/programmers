import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] emergency) {
        HashMap<Integer, Integer> hm = new HashMap();

        int[] priority = IntStream.of(emergency).boxed()
                            .sorted(Comparator.reverseOrder())
                            .mapToInt(Integer::intValue).toArray();

        for (int i = 0; i < priority.length; i++) {
            hm.put(priority[i], i + 1);
        }
        
        return IntStream.of(emergency).map(hm::get).toArray();
    }
}