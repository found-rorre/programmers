class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s).concat(overwrite_string);
        
        return answer.concat(my_string.substring(s + overwrite_string.length()));
    }
}