package recursion;


public class Telephone {
	
	public static void doCombinations(String word){
		getTelCombinations("", word);
	}
		
//	The combination of all possible coding of phone numbers.
	public static void getTelCombinations(String prefix, String word){
		if(word.trim().isEmpty()){
			System.out.println(prefix);
			return;
		}		
		for(int j=1; j<4; j++)
	    	getTelCombinations(prefix + Telephone_Helper.getCharKey(Character.getNumericValue(word.charAt(0)), j), word.substring(1));
	}
	

	
	public static void main(String[] args){
		doCombinations("3237588");
//		System.out.println(Telephone_Helper.printTelMap());
	}

}
