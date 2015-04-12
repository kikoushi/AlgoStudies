package dataStructures;

public class HashMap_ArrayImpTEST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap_ArrayImp<Integer, Patient> hm = new HashMap_ArrayImp<Integer, Patient>();
		
		hm.put(0, new Patient("c", "0", 5));
		hm.put(1, new Patient("kimya", "0", 5));
		
//		System.out.println(hm.size());
		System.out.println(hm.toString());
		System.out.println(hm.containsKey(5));
		System.out.println(hm.containsValue(new Patient("l", "2", 5)));
		System.out.println(hm.remove(0));
		hm.put(0, new Patient("c", "0", 5));
//		
		System.out.println(hm.toString());
//		hm.put(2, "caner");
//		System.out.println(hm.toString());
		System.out.println("d".compareTo("a"));
	}

}
