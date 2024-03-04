class Solution {
    
    static int ZeroCount = 0;
    
    public int[] solution(String s) {
		
		int count = 0;
		while(!s.equals("1")) {
			s = test(s);
			count++;
		}
        int[] answer = {count, ZeroCount};
        return answer;
    }
    
    
    private static String test(String s) {
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				count++;
				ZeroCount++;
			}
		}
		return Integer.toBinaryString(s.length() - count).toString();
	}
    

}