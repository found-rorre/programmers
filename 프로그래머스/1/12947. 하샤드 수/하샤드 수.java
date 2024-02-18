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