package testClasses;

import java.util.Random;

import dataStructures.Q31v2;

public class Q31v2Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random rndm = new Random();		
		Q31v2 s2 = new Q31v2();
		
		try {
			for(int i=0; i<4; i++){
				s2.push(1, rndm.nextInt(100)+1);
				s2.push(0, rndm.nextInt(10)+1);
				s2.push(2, rndm.nextInt(1000)+1);
			}
			s2.push(0, 1111);
			s2.push(0, 1111);
			System.out.println(s2.toString());
			
			
			s2.pop(0); s2.pop(0); s2.pop(0); s2.pop(0);
			s2.pop(1); s2.pop(1);
			s2.pop(2); s2.pop(2); s2.pop(2); s2.pop(2);

			System.out.println(s2.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
