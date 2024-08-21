import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String flag = null;
        int idx = str_list.length;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l")) {
                idx = i;
                flag = "l";
                break;
            } else if (str_list[i].equals("r")) {
                idx = i;
                flag = "r";
                break;
            }

        }

        if (flag != null && flag.equals("l")) {

            return Arrays.copyOfRange(str_list, 0, idx);
        } else if (flag != null && flag.equals("r")){

            return Arrays.copyOfRange(str_list, idx + 1, str_list.length);
        } else {

            return new String[0];
        }
    }
}