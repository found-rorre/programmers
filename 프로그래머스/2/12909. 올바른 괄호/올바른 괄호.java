import java.util.Arrays;
import java.util.List;


class Solution {
    boolean solution(String s) {
        
        int flag = 0;
		boolean answer = true;
		List<String>list =  Arrays.asList(s.split("")); 
		
		if(list.get(0) == ")") {
			answer = false;
			return answer;
		}
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).equals("(")) {
				flag += 1;
			}else {
				flag -= 1;
				
				if(flag < 0) {
					answer = false;
					break;
				}
			}
		}
        answer = flag == 0 ? true : false;
        
        return answer;
    }
}