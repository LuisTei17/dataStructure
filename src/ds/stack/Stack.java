package ds.stack;

public class Stack {
	private int maxSize;
	private String[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.maxSize = size;
		this.stackArray = new String[maxSize];
		this.top = -1;
	}
	
	public void push(String i) {
		if(!this.isFull()) {
			this.top++;
			this.stackArray[this.top] = i;			
		} 
	}
	
	public String pop() {
		if(!this.isEmpty()) {
			
		int old_pop = this.top;
		this.top--;
		return this.stackArray[old_pop];
		} else {
			return this.stackArray[top];
		}
	}
	
	public String peak() {
		return this.stackArray[this.top];
	}
	
	public boolean isEmpty() {
		return (this.top == -1);
	}
	
	public boolean isFull() {
		return (this.maxSize - 1 == top);
	}
}
