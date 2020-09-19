public class Stack {
	Node top;
	
	public boolean isEmptyS() {
		return top == null;
	}
	public int peekS() {
		return top.data;
	}
	public void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
	}
	public int pop() {
		int data = top.data;
		top = top.next;
		return data;
	}
	public void printList()
	{
		Node curr = top;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
}
}
