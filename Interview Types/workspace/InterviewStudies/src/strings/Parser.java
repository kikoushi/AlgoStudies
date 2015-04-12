package strings;


public class Parser{
	
	private enum SUIT {CLUBS, SPADES};

	private final static String[] wordList = new String[]{"I", "am", "pea", "nut", "peanut", "butter", "car", "love"};

	public static String wordCloudToSentence(String word){
	
		if(word == null)
			throw new IllegalArgumentException ("Type is wrong.");
	
		if(word.trim().equals(""))
			return "";
	
		String sentence = "";
		int start = 0;

		for(int end=1; end<=word.length(); end++)
			for(String s: wordList)
				if(s.toLowerCase().equals(word.substring(start, end).toLowerCase())){
					sentence = sentence + word.substring(start,end) + " ";
					start = end;
					break;
				}
		
		
		return sentence;		
	}
	
	public static void main(String[] args){
		String nword = wordCloudToSentence("iamlovecar");
		System.out.println(nword);
		System.out.println(SUIT.CLUBS);
	}


}