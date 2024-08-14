import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int[] index_list) {

        return Arrays.stream(index_list)
                .mapToObj(n -> String.valueOf(my_string.charAt(n)))
                .collect(Collectors.joining());
    }
}