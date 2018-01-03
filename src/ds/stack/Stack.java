package ds.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;

	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new long[size];
		this.top = -1;
	}

	public void push(long j) {
		this.top++;
		this.stackArray[this.top] = j;
	}

	public long pop() {
		int tmp = this.top;
		this.top--;
		return this.stackArray[tmp];
	}

	public long peak() {
		return this.stackArray[this.top];
	}

	public boolean isEmpty() {
		return (this.top == -1);
	}

	public boolean isFull() {
		return (this.top == this.maxSize-1);
	}
}
