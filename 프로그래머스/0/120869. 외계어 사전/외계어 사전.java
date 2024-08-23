import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {
        
        Arrays.sort(spell);
        String word = String.join("", spell);
        
        for (String s : dic) {
            String[] sortWord = s.split("");
            Arrays.sort(sortWord);
            if (word.equals(String.join("", sortWord))){
                return 1;
            }
        }
        
        return 2;
    }
}