class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);

        for (int[] query : queries) {
            int start = query[0];
            int end   = query[1];
            
            String target = new StringBuffer(sb.substring(start, end + 1)).reverse().toString();

            sb.replace(start, end + 1, target);
        }

        return sb.toString();
    }
}