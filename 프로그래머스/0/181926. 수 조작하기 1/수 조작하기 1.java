import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int solution(int n, String control) {
        HashMap<String, Integer> map = new HashMap(){{
            put("w", 1);
            put("s", -1);
            put("d", 10);
            put("a", -10);
            
        }};
        
        return n + Arrays.stream(control.split("")).mapToInt(map::get).sum();
    }
}