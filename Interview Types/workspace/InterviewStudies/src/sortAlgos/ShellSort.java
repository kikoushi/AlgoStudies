package sortAlgos;

/**
 * This is almost the same as Insertion sort. 
 * Shellsort looks k element back, sort data partially, then looks k/3 elements back and at last 1 element back(like in
 * insertion sort). This is a lot more efficient than Insertion sort since when it goes to sort 1 element at a time, most
 * of the array is already sorted and when the elements are partially sorted, insertion sort is quite efficient!
 * @author cm
 *
 */
public class ShellSort {
	
	public static <T extends Comparable<T>> void sort(T[] arr, int lo, int hi)
	{	
		int k = 1;
		while(k < arr.length/3)
			k = 3*k + 1;
			
		while(k>=1){
			for(int i=lo+k; i<=hi; i++)
				for(int j=i; j>=lo+k; j-=k)
					if(!less(arr[j], arr[j-k]) )
						break;
					else
						exch(j-k, j, arr);
			k = k/3;
		}
	}	

	public static <T extends Comparable<T>> void sort(T[] arr){
		sort(arr, 0, arr.length-1);
	}

	private static <T extends Comparable<T>> boolean less(T t1, T t2){
		return (t1.compareTo(t2) < 0);
	}

	private static <T extends Comparable<T>> void exch(int i, int j, T[] arr){
		T swap = arr[i];
		arr[i] = arr[j];
		arr[j] = swap;
	} 
	
	
}
