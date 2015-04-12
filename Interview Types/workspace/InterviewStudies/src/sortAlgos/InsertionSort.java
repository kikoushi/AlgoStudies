package sortAlgos;

/**
 * Efficient for small arrays and partially sorted big arrays. 
 * time complexity; n^2
 * memory complexity; <= c*lgn (in-place; memory efficient)
 * @author cm
 *
 */
public class InsertionSort {
	
	public static <T extends Comparable<T>> void sort(T[] arr){
		sort(arr, 0, arr.length-1);
	}	
	
	public static <T extends Comparable<T>> void sort(T[] arr, int lo, int hi){
		for(int i=lo+1; i<hi+1; i++)
			for(int j=i; j>lo; j--)
				if(less(arr[j], arr[j-1]))
					exch(j-1, j, arr);	
				else
					break;
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
