package trees;

public class BinaryTree<T>{

	
	private Node<T> root;
	private int size;
	
	
	private static final class Node<T>{
		
		private Node<T> leftChild;
		private Node<T> rightChild;
		private T value;
		
	}
	
	
	public BinaryTree(T _value){
		root = new Node<T>();
		root.value = _value;
		size = 0;
	}
	
	
	public boolean lookup(Node<T> node, T _value){
		if(node.value == _value)
			return true;
		if(node.leftChild != null)
			return lookup(node.leftChild, _value);
		if(node.rightChild != null)
			return lookup(node.rightChild, _value);
		return false;
	}
	
	
	public void add(T _value){
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
