package dataStructures;
import java.util.Stack;

public class Q32 extends Stack<Integer>{
 
	private static final long serialVersionUID = 1L;
	Stack<Integer> s;
	public Q32(){
		s = new Stack<Integer>();
	}
	
	public void push(int val){
		if(val <= min())
			s.push(val);
		super.push(val);
	}
	
	public Integer pop(){
		int val = super.pop();
		if(val == min())
			s.pop();
		return val;
	}
	
	public int min(){
		if(s.isEmpty())
			return Integer.MAX_VALUE;
		return s.peek();
	}
}
