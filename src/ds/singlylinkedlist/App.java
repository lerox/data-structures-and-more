package ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(220);
		myList.insertFirst(110);
		myList.insertFirst(999999);
		myList.insertLast(181818);

		myList.displayList();
	}
}
