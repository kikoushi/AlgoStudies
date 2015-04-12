package dataStructures;
import java.util.Stack;

public class Q36{

	Stack<Integer> greaterDecresingStack;
	Stack<Integer> smallerIncreasingStack;
	
	public Q36(){
		greaterDecresingStack = new Stack<Integer>();
		smallerIncreasingStack = new Stack<Integer>();
	}
	
	public void push(int t){
		
//		If sIs is Empty, directly add to it.
		if(smallerIncreasingStack.isEmpty()){
			smallerIncreasingStack.push(t);
			return;
		}
		
//		gDs is empty ;
//		if( t > sIs top value ); No problem
//		else, move sIs values to gDs until t < sIs, then push it to sIs.
		else if(greaterDecresingStack.isEmpty()){
			int sI = smallerIncreasingStack.peek();
			if(sI <= t)
				greaterDecresingStack.push(t);
			else{
				while(sI > t){
					greaterDecresingStack.push(smallerIncreasingStack.pop());
					if(smallerIncreasingStack.isEmpty())
						break;
					sI = smallerIncreasingStack.peek();
				}
				smallerIncreasingStack.push(t);
			}
			return;
		}
		
//		t is too big.
//		move gDs values to sIs until t < gDs, then push it to gDs.
		else if(t > greaterDecresingStack.peek()){
			int gD = greaterDecresingStack.peek();
			while( gD < t ){
				smallerIncreasingStack.push(greaterDecresingStack.pop());
				if(greaterDecresingStack.isEmpty())
					break;
				gD = greaterDecresingStack.peek();
			}
			greaterDecresingStack.push(t);
			return;
		}
		
//		t is too small.
//		move sIs values to gDs until t < sIs, then push it to sIs.
		else if(t < smallerIncreasingStack.peek()){
			int sI = smallerIncreasingStack.peek();
			while(sI > t){
				greaterDecresingStack.push(smallerIncreasingStack.pop());
				if(smallerIncreasingStack.isEmpty())
					break;
				sI = smallerIncreasingStack.peek();
			}
			smallerIncreasingStack.push(t);
			return;
		}			
		
		else{
			smallerIncreasingStack.push(t);
		}	
	}

	public int pop(){
		carry();
		return smallerIncreasingStack.pop();
	}
	
	private void carry(){
		while(!greaterDecresingStack.isEmpty())
			smallerIncreasingStack.push(greaterDecresingStack.pop());
	}
	
	@SuppressWarnings("unchecked")
	public String toString(){
		StringBuffer sb = new StringBuffer();

		carry();
		Stack<Integer> tempStack = (Stack<Integer>)smallerIncreasingStack.clone();
		while(!tempStack.isEmpty())
			sb.append(tempStack.pop() + "\n");
		
		return sb.toString();
		
	}
}
