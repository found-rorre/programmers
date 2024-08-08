import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public String solution(String rsp) {
        
        HashMap<String, String> map = new HashMap<>(){{
            put("0","5");
            put("2","0");
            put("5","2");
        }};

        return Stream.of(rsp.split("")).map(map::get).collect(Collectors.joining());
    }
}