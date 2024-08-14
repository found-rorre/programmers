import java.util.stream.Stream;

class Solution {
    public int solution(String number) {
        return Stream.of(number.split(""))
                .mapToInt(Integer::parseInt)
                .reduce((a, b) -> (a + b) % 9)
                .getAsInt();
    }
}