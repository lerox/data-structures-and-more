package ds.circularlinkedlist;

import ds.singlylinkedlist.Node;

public class CircularLinkedList {

	private Node first;
	private Node last;

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (this.isEmpty()) {
			this.last = newNode;
		}

		newNode.next = this.first; // old first
		this.first = newNode; // new first - first place
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if (this.isEmpty()) {
			this.first = newNode;
		} else {
			this.last.next = newNode; // appending
			this.last = newNode; // new pointer
		}
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

	private boolean isEmpty() {
		return (this.first == null);
	}
}
