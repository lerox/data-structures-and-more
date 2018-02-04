package ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();

		list.insertFirst(1);
		list.insertFirst(2);
		list.insertLast(4);
		list.insertAfter(1, 10);
		list.insertAfter(1, 11);
		list.insertAfter(1, 9);
		list.deleteKey(11);
		list.deleteFirst();
		list.deleteLast();
		list.displayList();
	}
}
