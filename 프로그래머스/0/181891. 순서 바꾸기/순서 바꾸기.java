class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int[] result = new int[num_list.length];
        int idx = n;
        
        for (int i = 0; i < result.length; i++) {
            result[i] = num_list[n++ % result.length];
        }
        
        return result;
    }
}