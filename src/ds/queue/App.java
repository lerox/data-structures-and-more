package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);

		myQueue.insert(10);
		myQueue.insert(1000);

		myQueue.insert(40);
		myQueue.insert(50);
		myQueue.insert(60);

		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
		System.out.println(myQueue.remove());
	}
}
