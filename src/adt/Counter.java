package adt;

public class Counter {
	private String type = null;
	private int number = 0;
	Counter(String type) {	
		this.type = type;
	}
	
	public void increment() {
		this.number++;
	}
	
	public int getCurrentValue() {
		return this.number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type + " - " + this.number;
	}
}
