class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuffer sb = new StringBuffer(my_string);
        StringBuffer target = new StringBuffer(my_string.substring(s, e + 1));
        
        sb.replace(s, e + 1, target.reverse().toString());

        return sb.toString();
    }
}