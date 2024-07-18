import java.util.HashMap;

class Solution {
    public int solution(String[][] closet) {

        HashMap<String, Integer> clotheType = new HashMap<>();

        for (String[] clothes : closet){
            if (clotheType.get(clothes[1]) == null){
                clotheType.put(clothes[1], 1);
            } else {
                clotheType.put(clothes[1], clotheType.get(clothes[1]) + 1);
            }
        }

        int count = 1;
        for(String key : clotheType.keySet()){
            count *= clotheType.get(key) + 1;
        }

        return --count;
    }
}