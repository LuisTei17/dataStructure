package ds.circularLinkedList;

public class App {
	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		
		myList.insertFirst(200);
		myList.insertFirst(10);
		myList.insertFirst(50);
		myList.insertFirst(20);
		myList.insertFirst(500);
		
		
		myList.insertLast(999);

		myList.displayList();
	}
}
