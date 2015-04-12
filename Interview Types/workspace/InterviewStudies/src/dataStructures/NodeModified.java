package dataStructures;

public class NodeModified {

	private NodeModified next;
	private int d;

	public NodeModified(int data){
		this.d = data;
	}

	void appendToTail(NodeModified tail){
		if(tail == null)
			return;
		
		NodeModified n = this;
		while(n.next != null)
			n = n.next;
		n.next = tail;
	}
	
	/**
	 * Question 2.1
	 */
	void delDups(){
		
		if(this == null) return;
		
		NodeModified previous = this;
		NodeModified control = previous.next;
		
		while(control != null){
			NodeModified checker = this;
			while(checker != control){
				if(checker.d == control.d){
					NodeModified tmp = control.next;
					previous.next = tmp;
					control = tmp;
					break;
				}
				checker = checker.next;
			}
			if (checker == control){
				previous = control;
				control = control.next;
//				previous.next = control;
			}
		}
	}
	
	boolean delNode(NodeModified n){		
		if(n == null || n.next == null)
			return false;
		
		NodeModified tmp = n.next;
		n.d = tmp.d;
		n.next = tmp.next;
		return true;
	}
	
	
//	Node sumResult(Node n1, Node n2, int carry){
//			
//		
//	}
	
	public String toString(){
		NodeModified n = this;
		String prnt = "";
		while(n != null) {
			prnt += n.d + ", ";
			n = n.next;
		}
		return prnt;
	}
}
