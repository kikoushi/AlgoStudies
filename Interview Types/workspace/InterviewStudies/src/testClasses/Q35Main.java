package testClasses;
import dataStructures.*;

public class Q35Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q35<Integer> myq = new Q35<Integer>();
		
		for(int i=1; i<10; i++)
			myq.enqueue(i);
		
		System.out.println(myq);
		
		try {
			myq.dequeue();
			System.out.println(myq);
			myq.enqueue(100);
			System.out.println(myq);
			myq.dequeue();
			System.out.println(myq);
			myq.enqueue(101);
			System.out.println(myq);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
