import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        ArrayList<Integer> List = new ArrayList();
        
        for(int i = 0;i < numlist.length; i++){
            if(numlist[i] % n == 0){
                List.add(numlist[i]);
            }
        }
        
        int[] answer = new int[List.size()];

        for(int i = 0; i< List.size(); i++){
            answer[i] = List.get(i);
        }
        
        return answer;
    }
}   