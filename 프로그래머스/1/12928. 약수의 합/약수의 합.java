import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        
        int answer = 0;
        ArrayList<Integer> divisor = new ArrayList<Integer>();
        
	    switch (n%2) {
		
            case 0:
                for(int i = 1; i <= n/2; i++) {
                    if( n % i == 0 ) {
                        divisor.add(i);
                    }
                }
                divisor.add(n);
                break;

            default:
                for(int i = 1; i <= n; i++) {
                    if( n % i == 0 ) {
                        divisor.add(i);
                    }
                }
                break;
		}
		
		for (Integer div : divisor) {
			answer += div;
		}
        
        return answer;
    }
}