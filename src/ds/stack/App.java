package ds.stack;

public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(10);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);

		while(!theStack.isEmpty()) {
			System.out.println(theStack.pop());
		}
	}
}
