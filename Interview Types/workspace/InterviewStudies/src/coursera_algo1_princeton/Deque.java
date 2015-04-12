package coursera_algo1_princeton;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
	   
	private Node head;
	private Node tail;
	private int size;
	
	private class Node{
		private Node next;
		private Node prev;
		private Item item;
		
		public Node(Item _item){
			next = null;
			prev = null;
			item = _item;
		}
	}
	
	public Deque(){
		head = null;
		tail = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return (size == 0) ? true : false;
	}

	public int size(){
		return size;
	}
	
	public void addFirst(Item item){
		if(item == null)
			throw new NullPointerException("Null item cannot be added");
		
		Node oldHead = head; 
		head = new Node(item);		
		if(tail == null) tail = head;
		else {
			head.next = oldHead;
			oldHead.prev = head;
		}
		++size;
	}
	
	public void addLast(Item item){
		if(item == null)
			throw new NullPointerException("Null item cannot be added");
		
		Node oldtail = tail;
		tail = new Node(item);
		if(head == null) head = tail;
		else {
			oldtail.next = tail;
			tail.prev = oldtail;
		}
		++size;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		Iterator<Item> it = iterator();
		while(it.hasNext())
			sb.append(it.next() + " ");
		return sb.toString();
	}
	   
	public Item removeFirst(){
		if(isEmpty())
			throw new NoSuchElementException("Deque is empty!");		
			
		Node aux = head;
		head = head.next;
		head.prev = null;
		aux.next = null;
		return aux.item;
	}
	
	public Item removeLast(){
		if(isEmpty())
			throw new NoSuchElementException("Deque is empty!");
		
		Node aux = tail;
		tail = tail.prev;
		aux.prev = null;
		tail.next = null;
		return aux.item;
	}
	
	@Override
	public Iterator<Item> iterator()  { return new ArrayIterator(head);  }
	
	private class ArrayIterator implements Iterator<Item>{

		private Node current;
		public ArrayIterator(Node node){
			current = node;
		}
		
		@Override
		public boolean hasNext() {
			return (current != null);
		}
		public void remove()      { throw new UnsupportedOperationException();  }
		
		@Override
		public Item next() {
			if (!hasNext()) throw new NoSuchElementException();
			Item item = current.item;
            current = current.next; 
            return item;
		}
		
	}
	
	public static void main(String[] args){
		Deque<Integer> deck = new Deque<Integer>();
		System.out.println(deck.isEmpty());
		
		for(int i=0; i<4; i++){
			deck.addFirst(i);
			deck.addLast(i+5);
		}
		System.out.println(deck.toString());
		System.out.println(deck.removeLast());
		System.out.println(deck);
		
//		Iterator it = deck.iterator();
//		while(it.hasNext())
//			System.out.println(it.next());
	}


}

























