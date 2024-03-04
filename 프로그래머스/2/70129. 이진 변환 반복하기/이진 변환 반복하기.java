/*
아직은 1차적인 방법으로 문제를 해결해 나가는 것 같다.
다른 사람들의 풀이를 보면 좀 더 알고리즘적(?)이다 라는 생각이 든다.

문자열에서 0의 갯수를 세고 2진수로 변환하는 코드를 메소드로 만들고
해당 메소드를 while문으로 반복하면서 문자열이 "1"이 될 때 까지 반복하면서
반복회수를 count로 측정한다.

ZeroCount는 글로변 변수로 선언한다.


실수
메소드 리턴값으로 0를 뺀 나머지의 길이를 2진수로 변경했어야 했는데
0의 갯수를 2진수로 변경해 오류가 발생했다.
*/

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
