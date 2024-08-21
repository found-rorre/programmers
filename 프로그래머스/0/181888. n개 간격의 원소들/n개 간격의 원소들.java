class Solution {
    public int[] solution(int[] num_list, int n) {
        int len = (int) Math.ceil((double) num_list.length / n);
        int[] result = new int[len];


        int idx = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = num_list[idx];
            idx += n; 
        }
        
        return result;
    }
}