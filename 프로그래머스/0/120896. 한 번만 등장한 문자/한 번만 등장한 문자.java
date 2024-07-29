import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

class Solution {
public String solution(String s) {

        HashMap<String, Integer> hm = new HashMap();
        ArrayList<String> answer = new ArrayList();

        Stream.of(s.split("")).forEach(S -> hm.merge(S, 1, Integer::sum));

        for (String key :  hm.keySet()){
            if(hm.get(key) == 1){
                answer.add(key);
            }
        }

        Collections.sort(answer);

        StringBuilder sb = new StringBuilder();
        answer.forEach(sb::append);


        return sb.toString();
    }
}