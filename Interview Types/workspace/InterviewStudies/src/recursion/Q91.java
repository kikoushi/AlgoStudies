package recursion;

public class Q91 {

//	Count the steps with simple recursion - BAD!!
	public static int cs(int n){
		if(n<0) return 0;
		if(n==0) return 1;
		
		return cs(n-1) + cs(n-2) + cs(n-3);		
	}
	
//	Count the steps with dynamic programming
	public static int cs_d(int n, int[] arr){
		if(n<0) return 0;
		if(n==0) return 1;		
		if(arr[n-1] != 0) return arr[n-1];
		
		arr[n-1] = cs_d(n-1,arr) + cs_d(n-3,arr) + cs_d(n-2,arr);
		return 	arr[n-1];
	}
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n= 30;
		int[] arr = new int[n];
		for (int i=0; i<arr.length; i++)
			arr[i] = 0;

		
/**
 * 		Runtime comparison of 2 methods!
 */
		
//		Runtime of Recursion
		long start_cs = System.nanoTime();
		cs(n);
		long end_cs   = System.nanoTime();
		
//		Runtime of Dynamic Programming
		long start_cs_d = System.nanoTime();
		cs_d(n,arr);
		long end_cs_d   = System.nanoTime();
		
		long time_cs = end_cs - start_cs;
		long time_cs_d = end_cs_d - start_cs_d;
		System.out.println("Recursion: " + time_cs);
		System.out.println("Dynamic Programming: " + time_cs_d);
		
	}

}
