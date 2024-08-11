import java.util.HashMap;
import java.util.stream.IntStream;

class Solution {
    public String solution(int[] numLog) {
        HashMap<Integer, String> debugMap = new HashMap(){{
            put(1, "w");
            put(-1, "s");
            put(10, "d");
            put(-10, "a");

        }};

        int[] debug = new int[numLog.length - 1];

        for (int i = 0; i < debug.length; i++) {
            debug[i] = numLog[i + 1] - numLog[i];
        }

        return IntStream.of(debug).mapToObj(n -> (String) debugMap.get(n)).reduce((a, b) -> a +b).get();
    }
}