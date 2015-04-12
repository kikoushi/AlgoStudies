package dataStructures;

public class Q13 {
	
	static String sol1(char[] str){
		
		if(str == null)		return new String();
		if(str.length < 2) 	return new String(str);
		
		int dupIdx = 1;
		boolean flag;
		
		for(int i=1; i<str.length; i++){
			flag = true;
			for(int j=0; j<dupIdx; j++){
				if(str[i] == str[j]){
					flag = false;
					break;
				}
			}
			if(flag){
				str[dupIdx] = str[i];
				dupIdx++;
			}
		}
		return new String(str, 0, dupIdx); // (charArray, offset, limit)
	}
	/**
	 * @param args
	 * Removing duplicates in a String without 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] dups = new char[]{'a','d','a','c','c','c','b'};
		System.out.println( sol1(dups)  );
		
	}

}
