class Solution {
    public int solution(int[] sides) {
        
//         int max = Math.max(sides[0], sides[1]);
//         int other = sides[0] + sides[1] - max;

//         int cnt = 0;

//         for (int i = max - other + 1; i <= max; i++) {
//             cnt++;
//         }
        
//         for (int i = max + 1;  i < max + other; i++){
//             cnt++;
//         }
            
//         return cnt;
        int min = Math.min(sides[0], sides[1]);

        return min * 2 - 1;
    }
}