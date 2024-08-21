class Solution {
        public int solution(int[] array) {
            
        int cnt = 0;
        
        for (int num : array) {
            String numString = String.valueOf(num);
            
            while (numString.contains("7")) {
                numString = numString.replaceFirst("7", "");
                cnt++;
            }
        }
        
        return cnt;
        }
}