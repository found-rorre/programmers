class Solution {
    public int solution(int n, int k) {
        int stickPrice = 12000;
        int drinkPrice = 2000;
        int total = (n * stickPrice) + (k * drinkPrice);

        while (n >= 10 && k > 0){
            n -= 10;
            k--;
            total -= drinkPrice;
        }
        
        return total;
    }
}