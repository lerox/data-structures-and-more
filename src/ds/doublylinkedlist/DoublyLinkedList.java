package ds.doublylinkedlist;

public class DoublyLinkedList {
	private Node first;
	private Node last;

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (this.isEmpty()) {
			this.last = newNode;
		} else {
			this.first.previous = newNode;
		}

		newNode.next = this.first;
		this.first = newNode;
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (this.isEmpty()) {
			this.first = newNode;
		} else {
			newNode.previous = this.last;
			this.last.next = newNode; // old last
		}

		this.last = newNode; // new last
	}

	// assuming non-empty
	public Node deleteFirst() {
		Node temp = this.first;

		if (this.first.next == null) {
			this.last = null;
		} else {
			this.first.next.previous = null;
		}

		this.first = this.first.next;

		return temp;
	}

	// assuming non empty
	public Node deleteLast() {
		Node temp = this.last;

		if (this.last == this.first) {
			this.last = null;
			this.first = null;
		}

		if (this.last != null && this.last.previous != null) {
			this.last.previous.next = null;
			this.last = this.last.previous;
		}

		return temp;
	}

	// assuming non empty
	public boolean insertAfter(int key, int data) {
		Node current = this.first;

		while(current.data != key) {
			current = current.next;

			if (current == null) {
				return false;
			}
		}

		Node newNode = new Node();
		newNode.data = data;

		newNode.previous = current;
		newNode.next = current.next;

		if (current.next != null) {
			current.next.previous = newNode;
		}

		if (newNode.next == null) {
			this.last = newNode;
		}

		current.next = newNode;

		return true;
	}

	public Node deleteKey(int data) {
		Node current = this.first;

		while (current.data != data) {
			current = current.next;

			if (current == null) {
				return null;
			}
		}

		if (this.first == current) {
			this.first = current.next;
		} else {
			current.previous.next = current.next;
		}

		if (current == this.last) {
			this.last = this.last.previous;
		} else {
			current.next.previous = current.previous;
		}

		return current;
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
}
