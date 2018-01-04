package ds.linkedlists;

// linked list
//
// - the list size can change easily
// - poor way to go to the last one node
public class App {

	public static void main(String[] args) {
		Node nodeA = new Node(); // node called head
		nodeA.data = 4;

		Node nodeB = new Node();
		nodeB.data = 3;

		Node nodeC = new Node();
		nodeC.data = 7;

		Node nodeD = new Node(); // node called tail
		nodeD.data = 8;

		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;

		// nodeD.next as the last one it points to null...

		System.out.println(checkLen(nodeA));
		System.out.println(checkLen(nodeD));
	}

	public static int checkLen(Node node) {
		int counter = 1;
		Node currentNode = node;

		while (currentNode.next != null) {
			counter++;
			currentNode = currentNode.next;
		}

		return counter;
	}
}
