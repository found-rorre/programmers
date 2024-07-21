import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] priorities, int location) {
        int pop = 0;    //  큐에서 빠저나간 갯수
        int top;        //  우선순위
        int topCount;   //  우선순위 갯수


//      queue에 배열를 저장한다. 배열엔 {인덱스, 우선순위}를 초기화 한다.
        LinkedList<int[]> queue = new LinkedList();

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
        }

        while (!queue.isEmpty()){

//      가장 큰 우선순위(top)를 찾고 0으로 초기화 시킨다. 찾는 과정에서 top의 갯수를 가져온다.
            top = IntStream.of(priorities).max().getAsInt();
            topCount = topCount(priorities, top);

            // queue를 순회하면서 location위치까지 찾는다.
            int size = queue.size();    // pop으로 크기가 변할 수 있기때문에 변수로 저장하여 사용한다.
            for (int i = 0; i < size; i++) {

                if(queue.peek()[1] == top) {

                    if(queue.peek()[0] == location){
                        return ++pop;
                    } else {
                        queue.poll();
                        pop++;

                        if(--topCount == 0){
                            break;
                        }
                    }

                } else {
                    queue.add(queue.poll());
                }
            }
        }
        return pop;
    }


    public static int topCount(int[] priorities, int top){

        int topCount = 0;

        for (int i = 0; i < priorities.length; i++) {
            if(priorities[i] == top){
                priorities[i] = 0;
                topCount++;
            }
        }
        return topCount;
    }
}