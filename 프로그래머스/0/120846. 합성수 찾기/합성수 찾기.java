import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        ArrayList<Integer> list = new ArrayList();

        for (int i = 3 ; i <= n; i++) {
            for (int j = 2; j <= i/2; j++) {

                if(i % j == 0){
                    list.add(i);
                    break;
                }
            }
        }

        return list.size();
    }
}