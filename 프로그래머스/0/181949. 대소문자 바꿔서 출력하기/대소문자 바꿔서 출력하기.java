import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] ascii = a.toCharArray();
        char[] result = new char[a.length()];

        for (int i = 0; i < ascii.length; i++) {
            if(ascii[i] >=65 && ascii[i] <= 90){
                result[i] = (char) (ascii[i] + 32);
            } else {
                result[i] = (char) (ascii[i] - 32);

            }
        }
        
        System.out.println(String.valueOf(result));
        
        
    }
}