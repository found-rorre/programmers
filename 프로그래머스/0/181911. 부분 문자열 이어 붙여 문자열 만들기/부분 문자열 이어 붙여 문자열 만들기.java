class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < my_strings.length; i++) {
            int start = parts[i][0];
            int end = parts[i][1];

            sb.append(my_strings[i].substring(start, end + 1));
        }

        return sb.toString();
    }
}