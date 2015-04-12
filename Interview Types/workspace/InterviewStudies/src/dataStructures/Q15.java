package dataStructures;

public class Q15 {
	
	
	static String sol1(String str){
		String[] arrStr = str.split(" ");
		str = "";
		
		for(int i=0; i<arrStr.length-1; i++)
			str += arrStr[i] + "%20";		
		str += arrStr[arrStr.length-1];
		
		return str;
	}
	
//	BETTER SOLUTION
	static String sol2(String str){
		int idx = str.indexOf(" ");
		while(idx != -1){			
			str = str.substring(0, idx) + "%20" + str.substring(idx+1);
			idx = str.indexOf(" ");
		}
		return str;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol2("to da yu ho t"));
	}

}
