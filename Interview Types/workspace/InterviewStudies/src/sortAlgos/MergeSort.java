package sortAlgos;

public class MergeSort {
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> void sort(T[] arr)
	{
		T[] aux = (T[])new Comparable[arr.length];
		sort(arr, aux, 0, arr.length-1);
//		sortwIns(arr, aux, 0, arr.length-1, 7); // 7 is a good value for CUTOFF
	}
	
	public static <T extends Comparable<T>> void sort(T[] arr, T[] aux, int l, int h)
	{		
		if(l>=h) return;
		int mid = l + (h-l)/2;
		sort(arr, aux, l, mid);
		sort(arr, aux, mid+1, h);
		merge(arr, aux, l, mid, h);
	}
	
	/**
	 * 1st Improvement over mergesort;
	 * use Insertion sort for small subarrays since mergesort is too complex for small arrays.
	 * 
	 * 2nd Improvement over mergesort;
	 * if two sorted subarrays are already sorted as a whole.
	 */
	private static <T extends Comparable<T>> void sortwIns(T[] arr, T[] aux, int l, int h, int CUTOFF)
	{		
		if(h <= l + (CUTOFF-1)) InsertionSort.sort(arr); // 1st Improvement
		int mid = l + (h-l)/2;
		sort(arr, aux, l, mid);
		sort(arr, aux, mid+1, h);
		if(!less(arr[mid+1],arr[mid])) return; // 2nd Improvement
		merge(arr, aux, l, mid, h);
	}	
	
	private static <T extends Comparable<T>> void merge(T[] arr, T[] aux, int l, int m, int h)
	{		
		assert(isSorted(arr,l,m));
		assert(isSorted(arr,m+1,h));
		
		for(int k=l; k<=h; k++)
			aux[k] = arr[k];	
		
		int i=l;
		int j=m+1;		
		for(int k=l; k<=h; k++){
			if		(i>m)			 		  arr[k] = aux[j++];
			else if	(j>h)				 	  arr[k] = aux[i++];
			else if	(less(aux[j], aux[i]))	  arr[k] = aux[j++];
			else							  arr[k] = aux[i++];
		}
		
		assert(isSorted(arr,l,h));
	}
	
	
	private static <T extends Comparable<T>> boolean isSorted(T[] arr, int l, int h)
	{
		for(int i=l+1; i<=h; i++)
			if(less(arr[i], arr[i-1])) return false;
		return true;
	}
	
	private static <T extends Comparable<T>> boolean less(T t1, T t2)
	{	return t1.compareTo(t2) < 0;	}
	
	
}
