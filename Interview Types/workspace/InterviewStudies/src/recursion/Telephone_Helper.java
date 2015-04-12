package recursion;

import java.util.HashMap;
import java.util.Map;

public final class Telephone_Helper {

	private static char[] alphabet;
	private static Map<Integer, char[]> telMap;	
		
	static {
		alphabet = "abcdefghijklmnoprstuvwxy".toCharArray();
		telMap = new HashMap<Integer, char[]>();
		
		createTelMap();
	}
	
	
//	Creating the telephone map
	/**
	 * 2 -> a,b,c
	 * 3 -> d,e,f
	 * ...
	 */
	private static void createTelMap(){
		int i=0;
		int j=2;
		while(j<10){
			char[] vals = new char[]{alphabet[i],alphabet[i+1],alphabet[i+2]};
			telMap.put(j,vals);
			i=i+3;
			j++;
		}
	}
	
//	Just a print function for the map
	public static String printTelMap(){
		StringBuffer sb = new StringBuffer();
		for(int i : telMap.keySet()){
			sb.append(i + "-{"); 
			for(char c : telMap.get(i)){
				sb.append(c + ",");
			}
			sb.deleteCharAt(sb.lastIndexOf(","));
			sb.append("}\n");
		}
		return sb.toString();
	}
	
//	Returns the corresponding character. (2,3) -> d 
	public static char getCharKey(int telKey, int place){
		return telMap.get(telKey)[place-1];
	}
	
}
