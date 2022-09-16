import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {

		
		Queue<String> que = new LinkedList<>();
		que.add("Kolkata");
		que.add("Patna");
		que.add("Delhi");
		que.add("Gurgoan");
		que.add("Noida");
		System.out.println("queue is : " + que);
		System.out.println("head of the queue : " + que.peek());
		que.remove();
		System.out.println("after removing head of queue : " + que);
		System.out.println("size of queue : " + que.size());
	}

}
