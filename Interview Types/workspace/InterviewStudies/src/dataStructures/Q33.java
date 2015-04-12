package dataStructures;

import java.util.*;

/**
 * Set of stacks that automatically adjust stacks.
 * @author cm
 *
 */
public class Q33 {
	
	private int capacity;
	private ArrayList<Stack<Integer>> stackList;
	private int stackIdx;
	private int stackFulness;
	
	public Q33(int _capacity){
		capacity = _capacity;
		stackIdx = 0;
		stackFulness = 0;
		stackList = new ArrayList<Stack<Integer>>();
		stackList.add(new Stack<Integer>());
	}
	
	public void push(int val){
		if(stackFulness == capacity){
			stackIdx++;
			stackList.add(new Stack<Integer>());
			stackFulness = 0;
		}			
		stackList.get(stackIdx).push(val);
		stackFulness++;
	}
	
	public int pop(){
		if(stackFulness == 0){
			stackList.remove(stackIdx);
			stackIdx--;
			stackFulness = capacity;
		}
		int val = stackList.get(stackIdx).pop();
		stackFulness--;
		return val;
	}
	
	@SuppressWarnings("unchecked")
	public String toString(){
		StringBuffer sb = new StringBuffer();
		Stack<Integer> st;
		for(int idx=stackIdx; idx>-1; idx--){
			st = (Stack<Integer>) stackList.get(idx).clone();
			while(!st.isEmpty()){
				sb.append(st.pop() + " ");
			}
		}
		return sb.toString();
	}

}
