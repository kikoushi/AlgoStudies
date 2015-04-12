package recursion;

public class CombinationOfString {

//	Recursion 
	public static void combine(String prefix, String word){
		if( !prefix.isEmpty() )
			System.out.println(prefix);
		
		for(int i=0; i<word.length(); i++)
			combine(prefix+word.charAt(i), word.substring(i+1));
	}	
	
	
//	2nd Way, Dynamic Programming
	public static String[] comb(String word){
		StringBuffer sb = new StringBuffer();
		String s = combine("",word,sb);
		return s.split("#");
	}	
	public static String combine(String prefix, String word, StringBuffer sb){
		if( !prefix.isEmpty() ){
			sb.append(prefix);
			sb.append("#");
		}
		for(int i=0; i<word.length(); i++)
			combine(prefix+word.charAt(i), word.substring(i+1), sb);
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combine("","abcd");
		
		String[] s_arr = comb("wxyz");
		for(String s: s_arr)
			System.out.println(s);

	}

}
