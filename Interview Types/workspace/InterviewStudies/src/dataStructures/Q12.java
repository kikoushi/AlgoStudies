package dataStructures;

public class Q12 {

	
	static String sol1(String str){
		if(str.equals("null"))
			return "";
		else
			return sol1(str.substring(1)) + str.charAt(0);
	}

		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol1("abcdnull"));
	}

}
