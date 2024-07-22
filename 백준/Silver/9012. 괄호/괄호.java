import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {


    static String isVPS(String PS) {

        Queue<String> queue = new LinkedList();

        for (String s : PS.split("")) {
            if (s.equals("(")) {
                queue.add(s);
            } else {
                if (queue.isEmpty()) {
                    return "NO";
                } else {
                    queue.poll();
                }
            }
        }
        if (queue.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        scan.nextLine();

        String[] PSs = new String[T];

        for (int i = 0; i < PSs.length; i++) {
            PSs[i] = scan.nextLine();
        }

        for (String PS : PSs) {
            System.out.println(isVPS(PS));
        }
    }
}