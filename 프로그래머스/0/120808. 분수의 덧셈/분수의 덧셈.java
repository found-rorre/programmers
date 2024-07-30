class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer;
        int denom;
        
        if (denom1 == denom2){
            numer = numer1 + numer2;
            denom = denom1;
        } else {
            numer = numer1 * denom2 + numer2 * denom1;
            denom = denom1 * denom2;
        }
        
        boolean flag = true;

        while (flag){
            flag = false;
            for(int i = 2; i <= numer && i <= denom; i++){
                if(numer % i == 0 && denom % i == 0){
                    numer /= i;
                    denom /= i;
                    flag =true;
                    break;
                }
            }
        }
        



        int[] answer = {numer, denom};
        return answer;
    }
}