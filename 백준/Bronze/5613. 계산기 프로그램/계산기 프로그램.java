import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String symbol = "+";
        boolean isNum = false;
        int result = 0;

        while (true){
            String input = scan.nextLine();
            if(input.equals("=")){
                System.out.println(result);
                break;
            //  숫자야?
            } else if(input.chars().allMatch(Character::isDigit)){
                int number = Integer.parseInt(input);

                switch (symbol){
                    case "+":
                        result += number;
                        break;
                    case "-":
                        result -= number;
                        break;
                    case "*":
                        result *= number;
                        break;
                    case "/":
                        result = result / number;
                }
            //  문자야?
            } else {
                symbol = input;
            }

        }
    }
}
