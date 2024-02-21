/*
주어진 문제를 간단히 정리하고 반복되는 부분을 캐치하고
적절한 변수를 활용해 반복문으로 완성

*/

class Solution {
    public boolean solution(int x) {
        
		int num = 0;
		int sum = 0;
		int harshad = x;
        
	    for(int i = 5; i >= 0; i--){
	    	
	    	num = (int) Math.floor(x / Math.pow(10, i));
	    	x -= Math.pow(10, i) * num;
	    	sum += num;
	    }
        
        boolean answer = harshad % sum == 0;
        
        
        return answer;
    }
}
