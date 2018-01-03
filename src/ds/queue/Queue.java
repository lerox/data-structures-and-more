package ds.queue;

public class Queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;

	public Queue(int maxSize) {
		this.maxSize = maxSize;
		this.queueArray = new long[this.maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}

	public void insert(long j) {
		this.rear++;
		this.queueArray[this.rear] = j;
		this.nItems++;
	}

	public long remove() {
		long temp = this.queueArray[this.front];
		this.front++;

		this.nItems--;

		return temp;
	}
}
