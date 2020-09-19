public class Queue
{
	Node head; 
	Node tail;
	
	public boolean isEmptyQ()
	{
		return head == null;
	}
	public int peekQ()
	{
		return head.data;
	}
	public void addQ(int data)
	{
		Node node = new Node(data);
		if(tail != null)	tail.next = node;
		tail = node;
		if(head == null)	head = node;
	}
	public int removeQ()
	{
		int data = head.data;
		head = head.next;
		if(head == null)	tail = null;
		return data;
	}
	public void printList()
	{
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
}
}


