/*

올바르지 않을 경우를 먼저 생각해보았다.
1. 첫 괄호부터 닫혀있는 경우
2. 중간이라도 닫힌 괄호가 열린 괄호보다 많은 경우
3. 짝이 맞지 않는경우

answer의 초기값을 true로 주어지고 위에 조건과 일치할 경우 false로 변환 후 return 시켰 종료했다.

*/ 
import java.util.Arrays;
import java.util.List;


class Solution {
    boolean solution(String s) {
        
        int flag = 0;
		boolean answer = true;
		List<String>list =  Arrays.asList(s.split("")); 

	    	// 1번
		if(list.get(0) == ")") {
			answer = false;
			return answer;
		}
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).equals("(")) {
				flag += 1;
			}else {
				flag -= 1;

				// 2번
				if(flag < 0) {
					answer = false;
					break;
				}
			}
		}
	// 3번
        answer = flag == 0 ? true : false;
        
        return answer;
    }
}
