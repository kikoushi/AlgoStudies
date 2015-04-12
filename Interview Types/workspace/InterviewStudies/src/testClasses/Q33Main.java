package testClasses;
import dataStructures.Q33;
import java.util.*;

public class Q33Main {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		Random rd = new Random();
		Q33 stackList = new Q33(6);
		for(int i=0; i<15; i++)
			stackList.push(rd.nextInt(100)+1);
		
		System.out.println(stackList.toString());
		for(int i=0; i<7; i++)
			System.out.println(stackList.pop());
		System.out.println(stackList.toString());
	}

}
