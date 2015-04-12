package dataStructures;

import java.util.*;

public class Structures {

	
	/**
	 * 	Map is more general; HashMap implements its methods actually.
	 *  Polymorphism is there as well.
	 */
	public static void structure_Map(){		
		
		Map<Integer, String> student2 = new HashMap<Integer, String>();
		System.out.println(student2 instanceof Map);
		System.out.println(student2 instanceof HashMap);
	}
	
	/**
	 * A hash map is a particular implementation of a map 
	 */
	public static void structure_HashMap(){		
		
		HashMap<Integer, String> student = new HashMap<Integer, String>();
		
		student.put(0, "Caner");
		student.put(122, "Caner1");
//		when same key given, overwrites the previous one. 
		student.put(122, "Caner1333");
		student.put(null, "Caner2121");

//		checking the key 
		System.out.println(student.containsKey(122));

//		deletion of a key&value pair
		student.remove(null);
		
		
//		printing out all values&keys. for values only: student.values()
		for(Integer key: student.keySet()){
			System.out.println(key + ":" + student.get(key));
		}	
		
	}
	
	
	public static void structure_StringBuilderBuffer(){
		
		StringBuffer sb = new StringBuffer();
		String sentence = "my dogs name is ralph.";
		String[] arr_st = sentence.split(" ");
		
		for(String s: arr_st){
			sb.append(s);
		}
		
		sb.delete(3, 7);
		System.out.println(sb);
		
	}
	
	public static void main(String[] args){
//		structure_HashMap();
//		structure_Map();
//		structure_StringBuilderBuffer();
		
		
	}

}
