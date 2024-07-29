class Solution {
    public int[] solution(int[] numbers, String direction) {
        
        return direction.equals("right") ? moveRight(numbers) : moveLift(numbers);
    }
    public int[] moveRight(int[] numbers){
        int[] arrNew = new int[numbers.length];

        arrNew[0] = numbers[numbers.length - 1];

        for (int i = 1; i < arrNew.length; i++) {
            arrNew[i] = numbers[i-1];
        }
        return arrNew;
    }
    
    public int[] moveLift(int[] numbers){
        int[] arrNew = new int[numbers.length];

        arrNew[arrNew.length -1] = numbers[0];

        for (int i = 1; i < arrNew.length; i++) {
            arrNew[i-1] = numbers[i];
        }

        return arrNew;
    }
}