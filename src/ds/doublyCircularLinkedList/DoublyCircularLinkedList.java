package ds.doublyCircularLinkedList;

public class DoublyCircularLinkedList {
	private Node first;
	private Node last;
	
	public DoublyCircularLinkedList() {
		// TODO Auto-generated constructor stub
		first = null;
		last  = null;
	}
	
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return first == null;
	}
	
	private void insertFirst(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		} else {
			first.previous = newNode;
		}
		
		newNode.next = first;
		first = newNode;
	}
	
	private void insertLast(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node();
		newNode.data = data;
		
		if(isEmpty()) {
			last = newNode;
		} else {
			last.next = newNode;
		}
		
		newNode.previous = last;
		last             = newNode;
	}
	
}
