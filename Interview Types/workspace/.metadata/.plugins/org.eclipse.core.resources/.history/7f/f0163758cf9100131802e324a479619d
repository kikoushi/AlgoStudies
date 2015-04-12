package coursera_algo1_princeton;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomizedQueue<Item> implements Iterable<Item> {
	
	private Item[] items;
	private int size;

	public RandomizedQueue(){
		items = (Item[])new Object[2];
		size = 0;
	}	
	
	public boolean isEmpty(){
		return (size==0);
	}	
	public int size(){
		return size;
	}	
	
	public void enqueue(Item item){
		if(item == null)
			throw new NullPointerException("Item must not be null!");
			
		if(isFull())
			resizeArr(2*size);
		items[size++] = item;
	}
	public Item dequeue(){
		if(isEmpty())
			throw new NoSuchElementException("Queue is empty!");
		
		int itemNo = randomIdx(size);
		Item item = items[itemNo];
		items[itemNo] = items[--size];
		items[size] = null;
		shrink();
		return item;
	}	
	public Item sample(){
		if(isEmpty())
			throw new NoSuchElementException("Queue is empty!");
		return items[randomIdx(size)]; 
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		Iterator<Item> it = iterator();
		while(it.hasNext())
			sb.append(it.next() + " ");
		return sb.toString();
	}
	
	public Iterator<Item> iterator(){
		return new ArrayIterator();
	}
	private class ArrayIterator implements Iterator<Item>{

		private int i;
		private ArrayIterator(){
			i = 0; 
		}
		
		public boolean hasNext() {	return ( i<size() );	}
		public void remove() {	throw new UnsupportedOperationException();		}
		
		public Item next() {
			if(!hasNext()) throw new NoSuchElementException("Queue is empty!");				
			return items[i++];
		}
	}
	
	private int randomIdx(int limit){
		Random rd = new Random();
		return rd.nextInt(limit);
	}
	private boolean isFull(){
		return (size==items.length);
	}
	private void resizeArr(int n){
		@SuppressWarnings("unchecked")
		Item[] aux = (Item[])new Object[n];
		for(int i=0; i<size; i++)
			aux[i] = items[i];
		items = aux;
	}
	private void shrink(){
		if(size <= items.length/4)
			resizeArr(items.length/2);
	}

	public static void main(String[] args){
		RandomizedQueue<Integer> rq = new RandomizedQueue<Integer>();
		for(int i=0; i<35; i++)
			rq.enqueue(i);
		System.out.println(rq.toString());
		System.out.println(rq.size);
		for(int i=0; i<25; i++)
			rq.dequeue();
		System.out.println(rq.toString());
		System.out.println(rq.size);
		System.out.println(rq.sample());
	}
	
}
