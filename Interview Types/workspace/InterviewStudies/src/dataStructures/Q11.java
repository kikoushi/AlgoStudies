package dataStructures;

import java.util.Arrays;
import java.util.Collections;

public class Q11 {

	/**
	 * Determine that the string consists of all unique chars. FOR ASCII; 256 chars.
	 */
	static boolean sol1(String str){
		boolean[] charArr = new boolean[256]; 
		for(int i=0; i<str.length(); i++){
			int value = str.charAt(i);
			if(charArr[value])
				return false;
			charArr[value] = true;
		}
		return true;		
	}
	
	static boolean sol2(String str){
//		int[] strChars = new int[str.length()];
//		for(int i=0; i<str.length(); i++){
//			strChars[i] = str.charAt(i);
//		}		
		char[] strChars = str.toCharArray(); //this is more compact than the 3 lines of code above. 
		
		Arrays.sort(strChars);
		for(int j=0; j<strChars.length-1; j++) {
//			System.out.print(strChars[j]);
			if(strChars[j] == strChars[j+1])
				return false;	
		}
		return true;
	}
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol1("to9dayis123456789"));
		System.out.println(sol2("todayi is123456789"));
		
	}

}
