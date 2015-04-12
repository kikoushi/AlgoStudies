package dataStructures;

import java.util.Arrays;

public class Q14 {

	
	static boolean sol1(String str1, String str2){
		
		if(str1.length() != str2.length())
			return false;
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<ch1.length; i++)
			if(ch1[i] != ch2[i])
				return false;		
		
		return true;
	}
	
	
	static boolean sol2(String str1, String str2){
		
		if(str1.length() != str2.length())
			return false;
		
		int[] arr_count = new int[256];
		
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				arr_count[str1.charAt(i)]++;
				arr_count[str2.charAt(i)]--;
			}			
		}				
				
		for(int val: arr_count)
			if(val != 0)
				return false;
		
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol2("msthematicsa", "ticsmtheama"));
	}

}
