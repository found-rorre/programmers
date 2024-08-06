class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] chars = my_string.toCharArray();
        char[] multiChars = new char[chars.length * n];
        
        int idx = 0;
        for (char c : chars) {
            for (int i = 0; i < n; i++) {
                multiChars[idx++] = c;
            }
        }
        
        
        return String.valueOf(multiChars);
        
    }
}