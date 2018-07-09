package ds.linkedlist;

public class App {
	public static void main(String[] args) {
		Node nodeA = new Node();
		nodeA.data = 4;
		
		Node nodeB = new Node();
		nodeB.data = 7;
		
		Node nodeC = new Node();
		nodeC.data = 10;
		
		Node nodeD = new Node();
		nodeD.data = 8;
		
		nodeA.proximo = nodeB;
		nodeB.proximo = nodeC;
		nodeC.proximo = nodeD;
		nodeD.proximo = null;
		
		System.out.println(listLength(nodeA));
		System.out.println(listLength(nodeB));
	}
	
	public static int listLength(Node node) {
		int tamanho = 0;
		
		Node currNode = node;
		
		while(currNode != null) {
			tamanho++;
			currNode = currNode.proximo;
		}
		return tamanho;
	}
}
