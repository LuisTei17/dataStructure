package ds.queue;

class Queue {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		// TODO Auto-generated constructor stub
		this.maxSize = size;
		this.queArray = new long[size];
		this.front = 0;
		this.rear  = -1;
		this.nItems = 0;
	}
	
	public void insert(long i) {
		// TODO Auto-generated method stub
		if(rear == maxSize - 1) {
			rear = -1;
		}
		rear++;
		queArray[rear] = i;
		nItems++;
	}
	
	public long remove() {
		long temp = queArray[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peekArray() {
		return queArray[front];
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
	
	public void view() {
		System.out.print(" [ ");
		for(long item : queArray) {
			System.out.print(item + " ");
		}
		System.out.println(" ] ");
	}	
}
