package ds.stack;

public class App {
	public static void main(String[] args) {
		/*
			Stack stack = new Stack(2);
			
			stack.push(30);
			stack.push(40);
			stack.push(50);
			
			System.out.println(stack.peak());
		*/
		reverseWord("Hello");
	}
	
	public static void reverseWord(String word) {
		Stack stackLetters = new Stack(word.length());
		String[] letters = new String[word.length()];
		letters = word.split("");
		for(String letter : letters) {
			stackLetters.push(letter);
		}
		while(!stackLetters.isEmpty()) {
			System.out.println(stackLetters.pop());
		}
	}
}
