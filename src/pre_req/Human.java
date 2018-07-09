package pre_req;

public class Human {
	private String nome;
	private int age;
	private int heightInches;
	private String eyeColor;
	
	public Human(String nome, int age, int heighInches, String eyecolor) {
		this.nome = nome;
		this.age = age;
		this.heightInches = heighInches;
		this.eyeColor = eyecolor;
	}
	
	public void speak() {
		System.out.println("Hello, my name is " + this.nome);
	}
	public void eat() {
		System.out.println("Eating...");
	}
	public void walk() {
		System.out.println("Walking...");
	}
	public void work() {
		System.out.println("Working....");
	}
}
