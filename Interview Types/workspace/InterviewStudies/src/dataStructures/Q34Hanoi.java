package dataStructures;
import java.util.Stack;

public class Q34Hanoi<T> {

	/*
	public static void hanoi(Stack<T> s0, Stack<T> s1, Stack<T> s2){
		if(s0.isEmpty())	return;
		else{
			Object val = s0.pop();
			hanoi(s0, s2, s1);
			s1.push(val);
			hanoi(s1, s0, s2);
		}
}

	public static void main(String[] args) {		

		Stack<Integer> start = new Stack<Integer>();
		Stack<Integer> buff = new Stack<Integer>();
		Stack<Integer> end = new Stack<Integer>();
		
		for(int i=5; i>0; i--)
			start.push(i);
		hanoi(start, buff, end);
		System.out.println(end);
	}
    */
}
