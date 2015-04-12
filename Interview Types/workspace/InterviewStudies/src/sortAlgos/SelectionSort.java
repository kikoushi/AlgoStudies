package sortAlgos;

/**
 * Select min, put at first idx, then select min from the rest, put at second, and keep goin' on...
 * Inefficient
 * @author cm
 *
 */
public class SelectionSort {
	
	public static <T extends Comparable<T>> void sort(T[] arr){
		for(int i=0; i<arr.length; i++){
			int minIdx = i;		
			for(int j=i+1; j<arr.length; j++)
				minIdx = less(arr[j], arr[minIdx]) ? j : minIdx;
			exch(i, minIdx, arr);
		}
	}
	
	private static <T extends Comparable<T>> boolean less(T a, T b){
		return a.compareTo(b) < 0;
	}
	
	private static <T extends Comparable<T>> void exch(int a, int b, T[] arr){
		T swap = arr[a];
		arr[a] = arr[b];
		arr[b] = swap;
	}

}
