package dataStructures;

public class Q18 {
	
	static boolean isSubstring(String s1, String s2){
		
//		return s1.contains(s2);
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		for(int i=0; i<len1; i++)
			if(s1.charAt(i) == s2.charAt(0)){
				if(len1 - i < len2)
					return false;
				if(s2.equals(s1.substring(i, i+len2)))
					return true;
				i += len2;
			}
		return false;
	}
	
	static boolean sol1(String str1, String str2){
		
		if(str1.length() != str2.length())
			return false;
		
		String str1x2 = str1 + str1;
		return isSubstring(str1x2, str2);
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol1("comeonbaby", "babycomeon"));
	}

}
