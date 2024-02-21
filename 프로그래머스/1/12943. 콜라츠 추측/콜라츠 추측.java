/*
간단한 문제였지만 중간에 놓친 점

조건상 주어진 숫자에 *2 나 *3를 했을 시 int 범위를 넘어가기에 
변수를 int가 아닌 long으로 설정해줘야 한다.

*/


class Solution {
    public int solution(long num) {
        
        int answer = -1;
        

        
        for(int i = 0; i < 500; i++) {

            if(num == 1){
                answer = i;
                break;
            }
            if(num % 2 == 0) {
                num /= 2;
            }else {
                num = num * 3 + 1;
            }
            
            

        }
        
        return answer;
    }
}
