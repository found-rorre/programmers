import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String polynomial) {
        
        String[] strings = polynomial.split(" ");
        Map<String, Integer> map = new HashMap();

        for (String string : strings) {
            if (string.equals("+")) {
                continue;
            }

            String key = string.contains("x") ? "x" : "";
            string = string.replace(key, "");

            int val = Integer.parseInt(string.equals("") ? "1" : string);

            map.merge(key, val, Integer::sum);
        }

        StringBuffer sb = new StringBuffer();

                if (map.get("x") != null) {
            String x = (map.get("x") == 1 ? "" : map.get("x")) + "x";
            sb.append(x);
        }
        if (map.size() == 2) {
            sb.append(" + ");
        }
        if (map.get("") != null) {
            String number = map.get("") + "";
            sb.append(number);
        }


        return sb.toString();
    }
}