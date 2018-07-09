package ds.queue;

public class App {
	public static void main(String[] args) {
		Queue q = new Queue(5);
		
		q.insert(100);
		q.insert(30);
		q.insert(10);
		q.insert(20);
		q.insert(40);
		q.insert(100);
		
		q.view();
	
	}
}
