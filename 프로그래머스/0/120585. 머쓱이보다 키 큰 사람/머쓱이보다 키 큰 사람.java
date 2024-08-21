class Solution {
    public int solution(int[] array, int height) {
        int cnt = 0;
        
        for (int n : array) {
            if (height < n) {
                cnt++;
            }
        }
        
        return cnt;
    }
}