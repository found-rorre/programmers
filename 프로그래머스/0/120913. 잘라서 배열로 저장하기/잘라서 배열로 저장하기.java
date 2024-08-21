
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        
        List<String> list = new ArrayList();
        StringBuffer sb = new StringBuffer(my_str);
        
        while (sb.length() > n){
            list.add(sb.substring(0, n));
            sb.delete(0, n);
        }
        
        list.add(sb.toString());
        
        return list.toArray(String[]::new);
    }
}