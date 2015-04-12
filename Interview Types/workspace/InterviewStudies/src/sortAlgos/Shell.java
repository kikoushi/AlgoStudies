package sortAlgos;

/*
 * Another Shell sort implementation. Same in the idea but separates the Insertion sort part with 
 * Shell sort property; intervals.
 */
public class Shell {

	/**
	 * @param arr
	 * @param jump is the interval; sorting for jump=4 is done in intervals; ..., 21, 5, 1.
	 */
	public static void sort(Comparable[] arr, int jump){
		int k=1;
//		int jump = 4;
		int N=arr.length;
		
		while(k<N/jump)
			k = jump * k + 1;
		
		while(k>0){
			System.out.println(k);
			sort(arr, 0, N-1, k);
			k/=jump;
		}
	}
	
	
	private static void sort(Comparable[] arr, int lo, int hi, int k)
	{
		for(int i=lo+k; i<=hi; i+=k){
			for(int j=i; j>=lo+k; j-=k){
				if(!less(arr[j],arr[j-k]))
					break;
				exch(j-k, j, arr);
			}
		}
	}
	
	private static boolean less(Comparable c1, Comparable c2)
	{
		return c1.compareTo(c2) < 0;
	}
	private static void exch(int i, int j, Comparable[] arr)
	{
		Comparable c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}
	
	
	
	public static void main(String[] args){
		
	}
}
