class Solution {
    public int solution(int a, int b) {
        
        int earth = Integer.parseInt("" + a + b);

        return earth >= (a * b * 2) ? earth : a * b * 2;
    }
}