package ds.singlyLinkedList;

public class SinglyLinkedList {
	private Node first;
	
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		 Node newNode = new Node();
		 newNode.data = data;
		 newNode.next = first;
		 first = newNode;
	}
	
	public Node deleteFirst() {
		 Node temp = first;
		 first = first.next;
		 return temp;
	}
	
	public void displayList() {
		System.out.println("List (first-->Last)");
		Node current = first;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println(" End ");
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}
}
