package ds.circularLinkedList;

public class CircularLinkedList {
	private Node first;
	private Node last;
	
	public CircularLinkedList() {
		first = null;
		last  = null;
	}
	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return  first == null;
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		}
		newNode.proximo = first;
		first 	        = newNode;
	}

	public void insertLast(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			first = newNode;
		} else {
			last.proximo = newNode;
			last = newNode;
		}
	}
	
	public int deleteFirst() {
		int temp  = first.data;
		
		if(first.proximo == null) {
			last = null;
		}
		
		first = first.proximo;
		return temp;
	}
	
	public void displayList() {
		System.out.println("List (first-->Last)");
		Node current = first;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.proximo;
		}
		System.out.println(" End ");
	}
}
