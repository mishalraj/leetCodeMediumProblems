package linkedLists;

public class RotateList {
	
	public class Node {
		Node next;
		int data;
		
		Node(int val)
		{
			this.data=val;
			next=null;
		}
	}
	
	Node head;

	public void push(int num) {
		Node newNode = new Node(num);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;

	}

	public void printNode(Node node) {
		if (node == null)
			return;

		else {
			Node temp = node;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}

	private Node rotateList(Node node, int k) {

		int length = 0;
		Node tail = null;
		Node n_head = null;
		Node hold = node;

		while (node != null) {
			++length;
			if (node.next == null)
				tail = node;
			node = node.next;
		}

		if (length <= 0)
			return null;

		node = hold;

		if (length <= k)
			k %= length;

		if (k == 0)
			return node;

		int counter = 0, index = length - k;

		while (node != null) {
			++counter;

			if (counter == index) {
				n_head = node.next;
				node.next = null;
			}

			node = node.next;
		}

		tail.next = hold;

		return n_head;

	}

	public static void main(String[] args) {
		RotateList node = new RotateList();

		node.push(1);
		node.push(2);
		node.push(3);
		node.push(4);
		node.push(5);
		node.push(6);

		node.printNode(node.head);
		int k = 2;

		Node res = node.rotateList(node.head, k);

		System.out.println();

		node.printNode(res);

	}

}
