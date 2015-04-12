package dataStructures;

public class Q21 {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NodeModified head = new NodeModified(30);
		
		for(int i=30; i>=0; i-=5)
			head.appendToTail(new NodeModified(i));
		for(int i=5; i<=15; i+=5)
			head.appendToTail(new NodeModified(i));
		NodeModified del = new NodeModified(33);
		head.appendToTail(del);
		head.appendToTail(new NodeModified(75));
		head.appendToTail(new NodeModified(20));
		
		System.out.println(head.toString());
		
		head.delDups();
		System.out.println(head.toString());
		
		head.delNode(del);
		
//		
		
		
//		Node n1 = new Node(3);
//		n1.appendToTail(new Node(5));
//		n1.appendToTail(new Node(5));
//
//		Node n2 = new Node(5);
//		n2.appendToTail(new Node(9));
//		n2.appendToTail(new Node(2));
//		
//		System.out.println(head.sumResult(n1, n2, 0));
	}

}
