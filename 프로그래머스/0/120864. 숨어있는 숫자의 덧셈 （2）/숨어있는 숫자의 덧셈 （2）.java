class Solution {
    public int solution(String my_string) {
        
        String[] split = my_string.split("[a-zA-Z]");
        int total = 0;
        
        for (String s : split) {
            if (!s.equals("")){
                total += Integer.parseInt(s);
            }
        }
        
        return total;
    }
}