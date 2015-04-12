package trees;

public class BinarySearchTree {
	
	private Node root;
	private int height; 
	
	private static final class Node{
		private Node leftChild;
		private Node rightChild;
		private int value;
		
		private Node(int _value){
			this.leftChild = null;
			this.rightChild = null;
			this.value = _value;
		}
	}
	
	public BinarySearchTree(int _value){
		this.root = new Node(_value);
		this.height = 0;	
	}
	
	public Node add(Node node, int _value){		
		if(node == null){
			node = new Node(_value);
			return node;
		}
		if(_value < node.value)
			node.leftChild = add(node.leftChild, _value);
		else
			node.rightChild = add(node.rightChild, _value);
		
		return node;
	}
	
	

	
	public boolean delete(Node node, int _value){		
		if(node == null)
			return false;
		
		if(node.value != _value)
			return delete(find(node, _value), _value);			
		else{
			if(node.leftChild != null && node.rightChild != null){				
				Node node_s = getLeftMostChild(node.rightChild);
//				System.out.println(node_s.value);
				node.value = node_s.value;
				return delete(node_s, node_s.value);
			}			
			else{		
				System.out.println(node.value);
				if(node.leftChild != null)
					node = node.leftChild;
				else if(node.rightChild != null)
					node = node.rightChild;
				else
					node = null;
//				System.out.println(node.value);				
			}	
			return true;
		}
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
	
	public void inOrderTraversal(Node node){
		if(node == null)
			return;
		
		inOrderTraversal(node.leftChild);
		System.out.print(node.value + " ");
		inOrderTraversal(node.rightChild);
	}	
	
	public void preOrderTraversal(Node node){
		if(node == null)
			return;
		
		System.out.print(node.value  + " ");
		preOrderTraversal(node.leftChild);
		preOrderTraversal(node.rightChild);
	}
	
	public void postOrderTraversal(Node node){
		if(node == null)
			return;
		
		postOrderTraversal(node.leftChild);
		postOrderTraversal(node.rightChild);
		System.out.print(node.value  + " ");
	}
	

	
	
	public static void main(String[] args){
		
		BinarySearchTree bst = new BinarySearchTree(7);
		int[] vals = {4,2,1,5,6,9,13,11,10,12,17,19};
		for(int val: vals)
			bst.add(bst.root, val);
		
		bst.inOrderTraversal(bst.root);
		System.out.println();
		bst.preOrderTraversal(bst.root);
		System.out.println();
		System.out.println(bst.delete(bst.root, 10));
		bst.postOrderTraversal(bst.root);
	}
}
