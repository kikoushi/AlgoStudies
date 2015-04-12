package ProgrammingInterviewsExposed;

/*************************************************************************
 * 
 *  A generic stack, implemented using a linked list.
 *
 *************************************************************************/

import java.util.*; 


public class Stack<T> {
	
	private Node<T> head;
	private int size;
	
	private static class Node<T>{
		private Node<T> next;
		private T data;		
	}
	
	
	public Stack(){
		head = null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void push(T o){
		Node<T> n = new Node<T>();
		n.data = o;
		if(isEmpty())
			head = n;
		else{
			n.next = head;
			head = n;
		}
		++size;
	}
	
	public T pop(){
		if(isEmpty()) throw new NoSuchElementException("Stack underflow");
		
		T o = head.data;
		head = head.next;
		--size;
		return o;
	}
	
	public T top(){
		if(isEmpty()) throw new NoSuchElementException("Stack underflow");
		return head.data;
	}
	

	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		Node<T> temp = head;
		while(temp != null){
			sb.append(temp.data + "-");
			temp = temp.next;
		}
		return sb.toString();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(4);
		s.push(5);
		System.out.println(s.getSize());
		s.pop();
		System.out.println(s.toString());
		s.push(22);
		System.out.println(s.toString());
	}

}
