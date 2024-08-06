class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        for (int num : num_list){
            if (num % 2 == 0){
                even++;
            }
        }
        
        
        int[] answer = {even, num_list.length - even};
        return answer;
    }
}