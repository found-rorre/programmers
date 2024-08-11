import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] newArr = Arrays.copyOf(num_list, num_list.length + 1);
        int lastVal   = num_list[num_list.length - 1];
        int secondVal = num_list[num_list.length - 2];
        
        newArr[newArr.length - 1] = lastVal > secondVal ?  lastVal - secondVal : lastVal * 2;
        
        return newArr;
    }
}