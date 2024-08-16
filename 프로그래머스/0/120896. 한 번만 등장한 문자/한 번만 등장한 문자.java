import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String s) {

        StringBuffer sb = new StringBuffer();
        
        Map<String, Integer> map = new HashMap();
        Stream.of(s.split("")).forEach(str -> map.merge(str, 1, Integer::sum));

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                sb.append(key);
            }
        }

        return Stream.of(sb.toString().split("")).sorted().collect(Collectors.joining());
    }
}