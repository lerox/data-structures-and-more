public class Counter {

	int counter;
	String str;

	public Counter(String str) {
		this.str = str;
	}

	public void increment() {
		this.counter++;
	}

	public int getCurrentValue() {
		return this.counter;
	}

	public String toString() {
		return "counter: " + this.counter + " str: " + this.str;
	}
}
