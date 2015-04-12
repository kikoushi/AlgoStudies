package dataStructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyQueue<K> implements Iterable<K>{
	
	@SuppressWarnings("hiding")
	private class Node<K>{
		Node<K> next;
		K data;
		
		@SuppressWarnings("unused")
//		public Node(){
//			this.next = null;
//			this.data = null;
//		}
		
		public Node(K k){
			this.next = null;
			this.data = k;
		}
	}
	
	private Node<K> first;
	private Node<K> last;
	private int size;
	
	public MyQueue(){
		this.first = null;
		this.last = null;
		this.size = 0;
	}
		
	public boolean isEmpty(){
		return this.first == null;
	}
	
	public int size(){
		return this.size;
	}
	
	public void enqueue(K k){
		Node<K> newLast = new Node<K>(k);
		if(isEmpty()){
			this.last = newLast;
			this.first = this.last;
		}	
		else{
			this.last.next = newLast;
			this.last = newLast;
		}
		size++;
	}
	
	public K peek(){
		if(isEmpty())	throw new NoSuchElementException("Queue underflow");		
		return this.first.next.data;
	}
	
	public K dequeue(){
		if(isEmpty()) throw new NoSuchElementException("Queue underflow");
		Node<K> n = this.first;
		this.first = this.first.next;
		n.next = null;
		size--;
		return n.data;
	}
	
//	public String toString(){
//		if(isEmpty()) return "Empty Queue!"; 
//		StringBuilder sb = new StringBuilder();
//		Node<K> n = this.first;
//		while(n != null){
//			sb.append(n.getData() + ":");
//			n = n.getNext();
//		}
//		return sb.toString();
//	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(K k: this)
			sb.append(k + ":");
		return sb.toString();
	}
	
	public Iterator<K> iterator(){
		return new ListIterator<K>(this.first);
	}
	
	private class ListIterator<K> implements Iterator<K>{		
		private Node<K> current;
		
		public ListIterator(Node<K> f){
			current = f;
		}

		public boolean hasNext() {	return current != null; }
		public void remove() {	throw new UnsupportedOperationException();	}		
				
		public K next() {
			if( !hasNext() ) throw new NoSuchElementException();
			K k = current.data;
			current = current.next;
			return k;
		}
		
	}
	
	public static void main(String [] args){
		MyQueue<Integer> mQ = new MyQueue<Integer>();
		mQ.enqueue(5);
		mQ.enqueue(10);
		mQ.enqueue(15);
		System.out.println(mQ.toString());
		mQ.dequeue();
		System.out.println(mQ.toString());
		System.out.println(mQ.peek());
		
		int[][] my2Darr = new int[5][3];
		my2Darr[0][0] = 3;
		my2Darr[0][2] = 10;
		System.out.println(my2Darr.length);
		
	}
	
//	public Node getHead() {
//		return head;
//	}
//	public void setHead(Node head) {
//		this.head = head;
//	}
//	public Node getTail() {
//		return tail;
//	}
//	public void setTail(Node tail) {
//		this.tail = tail;
//	}
//	public int getSize() {
//		return size;
//	}
//	public void setSize(int size) {
//		this.size = size;
//	}
	
	

}