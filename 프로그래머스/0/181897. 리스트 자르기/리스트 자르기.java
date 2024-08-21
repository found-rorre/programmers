class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        int[] result;
        int to = slicer[0];
        int from = slicer[1];
        int gap = slicer[2];
        
        switch (n) {
            case 1:

                result = new int[from + 1];

                for (int i = 0; i < result.length; i++) {
                    result[i] = num_list[i];
                }
                break;
            case 2:

                result = new int[num_list.length - to];

                for (int i = 0; i < result.length; i++) {
                    result[i] = num_list[i + to];
                }
                break;
            case 3:

                result = new int[from - to + 1];

                for (int i = 0; i < result.length; i++) {
                    result[i] = num_list[i + to];
                }
                break;
            default:
                result = new int[(int)Math.ceil((double) (from - to + 1) / gap)];

                for (int i = 0; i < result.length ; i++) {
                    result[i] = num_list[to];
                    to += gap;

                }
        }
        
        return result;
    }
}