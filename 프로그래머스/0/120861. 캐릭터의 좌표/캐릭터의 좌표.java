class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int width = board[0] / 2;
        int length = board[1] / 2;

        int[] location = {0, 0};

        for (String key : keyinput) {
            if (key.equals("up")) {
                location[1] += location[1] + 1 <= length ? 1 : 0;
            } else if (key.equals("down")) {
                location[1] -= location[1] - 1 >= -length ? 1 : 0;
            } else if (key.equals("right")) {
                location[0] += location[0] + 1 <= width ? 1 : 0;
            } else if (key.equals("left")) {
                location[0] -= location[0] - 1 >= -width ? 1 : 0;
            }
        }

        return location;
    }
}