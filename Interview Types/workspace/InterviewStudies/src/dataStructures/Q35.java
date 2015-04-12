package dataStructures;
import java.util.Stack;

public class Q35<T>{

	private Stack<T> newestStack;
	private Stack<T> oldestStack;
	
	public Q35(){
		newestStack = new Stack<T>();
		oldestStack = new Stack<T>();
	}
	
	public void enqueue(T t){
		newestStack.push(t);
	}
	
	public T dequeue() throws Exception{
		
		if(oldestStack.isEmpty() && newestStack.isEmpty())
			throw new Exception("stack is Empty.");
		
		shiftStacks();

		T val = oldestStack.pop();
		return val;
	}
	
	private void shiftStacks(){		
		while(!newestStack.isEmpty())
			oldestStack.push(newestStack.pop());	
	}
	
	@SuppressWarnings("unchecked")
	public String toString(){
		shiftStacks();
		newestStack = (Stack<T>)oldestStack.clone();
		
		StringBuffer sb = new StringBuffer();
		sb.append("front->");
		while(!oldestStack.isEmpty()){
			sb.append(oldestStack.pop().toString());
			sb.append("-");
		}
		sb.append("<back");
		
		oldestStack = (Stack<T>)newestStack.clone();
		newestStack.clear();
		
		return sb.toString();
	}
	
//	public T dequeue() throws Exception{
//		if(newestStack.isEmpty())
//			throw new Exception("Queue is Empty!");
//		
//		while(!newestStack.isEmpty())
//			oldestStack.push(newestStack.pop());
//		
//		T t = oldestStack.pop();
//		
//		while(!oldestStack.isEmpty())
//			newestStack.push(oldestStack.pop());
//		
//		return t;
//	}
	
//	public String toString(){
//		StringBuffer sb = new StringBuffer();
//		sb.append("back->");
//		
//		if(newestStack instanceof Stack)
//			oldestStack = (Stack<T>)newestStack.clone();
//		while(!oldestStack.isEmpty())
//			sb.append(oldestStack.pop() + "-");
//		sb.append(">front");		
//		oldestStack.clear();
//		
//		return sb.toString(); 
//	}
	
	
}
