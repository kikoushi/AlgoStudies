package testClasses;

import java.util.*;

import dataStructures.Q31;

public class Q31Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random rndm = new Random();		
		Q31 s = new Q31();
		
		try {
			for(int i=0; i<10; i++){
				s.push(0, rndm.nextInt(10));
				s.push(1, rndm.nextInt(100));
				s.push(2, rndm.nextInt(1000));
			}
			System.out.println(s.toString());
			
			for(int i=0; i<3; i++){
				s.pop(0);
				s.pop(1);
			}
			System.out.println(s.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
