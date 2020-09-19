public class LinkList {
	Node head;

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(data);
	}

	public void prepend(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;

	}

	public void delete(int data) {
		if (head == null)
			return;
		if (head.data == data) {
			head = head.next;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			if (curr.next.data == data) {
				curr.next = curr.next.next;
				return;
			}
			curr = curr.next;
		}
	}
	public void printList() {
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
}
}
