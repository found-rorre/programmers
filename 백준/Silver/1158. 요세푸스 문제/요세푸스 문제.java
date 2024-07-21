import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int N;
        int K;
        StringBuilder answer = new StringBuilder();

        Scanner scan = new Scanner(System.in);
        String[] inputs = scan.nextLine().split(" ");

        N = Integer.parseInt(inputs[0]);    // 배열의 길이
        K = Integer.parseInt(inputs[1]);    // 출력 간격

        Queue<Integer> queue = new LinkedList();

        IntStream.range(1, N + 1).forEach(n -> queue.add(n));


        answer.append("<");
        do{
            for(int i = 0; i< K - 1; i++){
                queue.add(queue.remove());
            }
            answer.append(Integer.toString(queue.remove()));
            if(queue.isEmpty()){
                answer.append(">");
                break;
            }
            answer.append(", ");
        }while (true);

        System.out.println(answer);
    }
}