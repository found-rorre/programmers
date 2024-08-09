class Solution {
    public int solution(int[] numbers, int k) {
        int idx = 0;
        int num = numbers.length;

        for (int i = 1; i < k; i++) {
            idx = (idx + 2) % num;
        }

        return idx + 1;
    }
}