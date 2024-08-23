import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList();
        int group = 5;

        for (int i = 0; i < names.length; i += group) {
            list.add(names[i]);
        }

        return list.toArray(String[]::new);

    }
}