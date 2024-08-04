class Solution {
    public int[] solution(int money) {
        
        int price = 5500;
        int cnt = money / price;
        int change = money % price;
        
        int[] answer = {cnt, change};
        return answer;
    }
}