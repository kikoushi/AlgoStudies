package dataStructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Queue<Patient> lol = new PriorityQueue<Patient>();
		
		lol.add(new Patient("Can", "111", 0));
		lol.add(new Patient("Can10", "111", 10));
		lol.add(new Patient("Can2", "111", 2));
		lol.add(new Patient("Can1", "111", 1));
		
		while(!lol.isEmpty())
			System.out.println(lol.poll().getPriority());
		
	}

}
