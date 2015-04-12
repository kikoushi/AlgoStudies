package dataStructures;

import java.util.LinkedList;

public class PalindromNoSpace {
	
	
	public static boolean isPalindrom(int number){
		
		int s=10;
		int b=10;
		while(number/b >= 10)
			b *= 10;
		
		while(b>=s){
			if(number/b != number%s) return false;
			number -= (b*(number/b));
			number /= 10;
			b /= 100;
		}
		return true;		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrom(1234554321));
		
	}

}
