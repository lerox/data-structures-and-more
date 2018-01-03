package ds.singlylinkedlist;

public class SinglyLinkedList {
	private Node first;

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;

		this.first = newNode;
	}

	public Node deleteFirst() {
		Node tmp = this.first;
		this.first = this.first.next;

		return tmp;
	}

	public void displayList() {
		System.out.println("List (first --> last)");
		System.out.println("<<<");
		Node current = this.first;

		while(current != null) {
			current.displayNode();
			current = current.next;
		}

		System.out.println(">>>");
	}

	public void insertLast(int data) {
		Node current = this.first;
		while (current.next != null) {
			current = current.next;
		}

		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
}
