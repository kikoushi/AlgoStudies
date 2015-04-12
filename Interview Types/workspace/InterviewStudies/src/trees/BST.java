package trees;


public class BST {
	
	private Node root;
	private int height; 
	
	private static final class Node{
		private Node parent;
		private Node leftChild;
		private Node rightChild;
		private int value;
		
		private Node(int _value){
			this.parent = null;
			this.leftChild = null;
			this.rightChild = null;
			this.value = _value;
		}
	}
	
	public BST(int _value){
		this.root = new Node(_value);
		this.height = 0;	
	}
	
	public Node add(Node node, int _value){		
		if(node == null){
			node = new Node(_value);
			return node;
		}
		if(_value < node.value){
			Node child = add(node.leftChild, _value);
			node.leftChild = child;
			child.parent = node;
		}
		else{
			Node child = add(node.rightChild, _value);
			node.rightChild = child;
			child.parent = node;
		}
		
		return node;
	}
	
	
	public void inOrderTraversal(Node node){
		if(node == null)
			return;
		
		inOrderTraversal(node.leftChild);
		System.out.println(node.value);
		inOrderTraversal(node.rightChild);
	}
	
//	public boolean delete(Node root, int _value){
//		Node node_d = find(root, _value);
//		if(node_d == null)
//			return false;
//		return doDelete(node_d, _value);	
//	}
//	
//	public boolean doDelete(Node node, int _value){	
//		
//		if(node.leftChild == null && node.rightChild == null){
//			node = null;
//			return false;
//		}
//		if(node.leftChild != null){
//			Node sub = getRightMostChild(node.leftChild);
//			node.value = sub.value;
//			return doDelete(node, sub.value);			
//		}
//		else{
//			Node sub = getLeftMostChild(node.rightChild);
//			node.value = sub.value;
//			return doDelete(node, sub.value);
//		}
//	}
	
	
	public boolean delete(Node node, int _value){		
		if(node == null)
			return false;
		
		if(node.value != _value)
			return delete(find(node, _value), _value);			
		else{
			if(node.leftChild != null && node.rightChild != null){				
				Node node_s = getLeftMostChild(node.rightChild);				
				node.value = node_s.value;
				return delete(node_s, node_s.value);
			}			
			else{		
				if(node.leftChild != null)
					replace(node, node.leftChild);
				else if(node.rightChild != null)
					replace(node, node.rightChild);
				else
					replace(node, null);		
			}	
			return true;
		}
	}
	
	public void replace(Node node1, Node node2 ){
		if(node1.parent.leftChild == node1)
			node1.parent.leftChild = node2;
		else
			node1.parent.rightChild = node2;
	}
	
	public Node find(Node node, int _value){
		if(node == null)
			return null;
		if(node.value == _value)
			return node;
		if(_value < node.value)
			return find(node.leftChild, _value);
		else
			return find(node.rightChild, _value);
	}
	
	private Node getLeftMostChild(Node node){
		if(node.leftChild == null)
			return node;
		return getLeftMostChild(node.leftChild);
	}
	
	
	
	
	
	public static void main(String[] args){
		
		BST bst = new BST(7);
		int[] vals = {4,2,1,5,6,9,13,11,10,12,17,19};
		for(int val: vals)
			bst.add(bst.root, val);
		
//		System.out.println(bst.root.rightChild.leftChild);
		bst.inOrderTraversal(bst.root);
		System.out.println(bst.delete(bst.root, 7));
		System.out.println();
		bst.inOrderTraversal(bst.root);
			
	}
}
