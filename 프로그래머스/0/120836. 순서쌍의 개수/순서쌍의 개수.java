class Solution {
    public int solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                cnt++;
                if ((n / i) == i) {
                    return cnt * 2 - 1;
                } else if ((n / i) < i) {
                    return --cnt * 2;
                }

            }
        }
        return 0;
    }
}