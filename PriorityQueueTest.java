//page 855
import java.util.PriorityQueue;
public class PriorityQueueTest {
    public static void main(String[] a){
        PriorityQueue<Double> queue = new PriorityQueue<Double>();
        
        //inset elements into queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        
        System.out.println("Polling from queue");
        
        while(queue.size() > 0){
            System.out.printf("%.1f\n", queue.peek()); //view of the top element
            queue.poll();
        }
    }
}
