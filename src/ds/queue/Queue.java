package ds.queue;

public class Queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		this.queueArray = new long[this.maxSize];
		this.front = 0;
		this.rear = -1;
	}

	public void insert(long j) {
		this.rear++;
		this.queueArray[this.rear] = j;
	}

	public long remove() {
		long temp = this.queueArray[this.front];
		this.front++;

		return temp;
	}
}
