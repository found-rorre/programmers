class Solution {
    public String solution(String code) {
        
        String answer = "";
        String[] codes = code.split("");
        int mode = 0;        
        
        for (int i = 0; i < codes.length; i++) {
            if (mode == 0) {
                if (!codes[i].equals("1") && i % 2 == 0) {
                    answer += codes[i];
                } else if (codes[i].equals("1")) {
                    mode = 1;
                }
            } else {
                if (codes[i].equals("1")) {
                    mode = 0;
                } else if (!codes[i].equals("1") && i % 2 != 0) {
                    answer += codes[i];
                }
            }
        }
        
        if (answer.length() == 0) {
            return "EMPTY";
        }
        
        return answer;
    }
}