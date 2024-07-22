import java.util.HashMap;

class Solution {
    public int solution(String s) {
        
            HashMap<String, Integer> hashMap = new HashMap();

            hashMap.put("zero", 0);
            hashMap.put("one", 1);
            hashMap.put("two", 2);
            hashMap.put("three", 3);
            hashMap.put("four", 4);
            hashMap.put("five", 5);
            hashMap.put("six", 6);
            hashMap.put("seven", 7);
            hashMap.put("eight", 8);
            hashMap.put("nine", 9);

            int result = 0;
            int index = 0;
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);

                if(c >= 97 && c <= 122) {
                    if(count++ == 0){
                        index = i;
                    }
                    if(hashMap.get(s.substring(index, index + count)) != null){
                        System.out.println(s.substring(index, index + count));
                        result = result * 10 + hashMap.get(s.substring(index, index + count));
                        count = 0;
                    }
                } else {
                    result = (result * 10) + Integer.parseInt(String.valueOf(c));
                }
            }
            return result;
    }
}