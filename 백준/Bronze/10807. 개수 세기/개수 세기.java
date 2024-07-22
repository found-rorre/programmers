import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Hashtable<String,Integer> ht = new Hashtable();

        int N;
        String[] arr;
        String target;

        N = scan.nextInt();
        scan.nextLine();

        arr = scan.nextLine().split(" ");

        target = scan.nextLine();

        for (String s : arr){
            ht.merge(s, 1, Integer::sum);
        }

        System.out.println(ht.get(target) == null ? 0 : ht.get(target));
    }
}
