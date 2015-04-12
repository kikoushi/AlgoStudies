package testClasses;
import dataStructures.*;
public class Q32Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q32 modifiedStack = new Q32();
		
		modifiedStack.push(22);
		modifiedStack.push(3);
		modifiedStack.push(12);
		modifiedStack.push(2);
		modifiedStack.push(1);
		
		System.out.println(modifiedStack.min());		
		modifiedStack.pop();
		System.out.println(modifiedStack.min());
		modifiedStack.pop();
		System.out.println(modifiedStack.min());
		
	}

}
