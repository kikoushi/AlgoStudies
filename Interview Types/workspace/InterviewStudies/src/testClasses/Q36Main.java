package testClasses;
import dataStructures.Q36;

public class Q36Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q36 ascStack = new Q36();
		
		
		for(int j=5; j>2; j--)
			ascStack.push(j);
		
		System.out.println(ascStack);
		
		ascStack.push(13);
		ascStack.push(3);
		ascStack.push(8);		
		System.out.println(ascStack);
		
		ascStack.pop();
		System.out.println(ascStack);
		
		ascStack.push(1);
		System.out.println(ascStack);
	}

}
