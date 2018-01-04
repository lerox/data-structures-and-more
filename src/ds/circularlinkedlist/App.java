package ds.circularlinkedlist;

// circular linked list
//
// - can perform insert last, for example, better than linked list
public class App {

	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();

		myList.insertFirst(100);
		myList.insertLast(200);
		myList.insertLast(11);
		myList.insertFirst(1);

		myList.displayList();
	}
}
