public class App {
	public static void main(String args[]) {
		Counter cnt = new Counter("some id");

		Human derek = new Human("Derek", 10, 999, "green");
		derek.speak();

		System.out.println(cnt.toString());
		cnt.increment();
		cnt.increment();
		cnt.increment();
		cnt.increment();
		cnt.increment();

		System.out.println(cnt.toString());
	}
}
