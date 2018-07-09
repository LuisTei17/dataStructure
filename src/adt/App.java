package adt;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter("SSS");
		
		counter.getCurrentValue();
		
		counter.increment();
		counter.increment();
		counter.increment();
		
		System.out.println(counter.getCurrentValue());
		
		counter.toString();
	}

}
