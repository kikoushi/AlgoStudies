package sortAlgos;

public class MergeSortButtomUp {
	
	/**
	 * MergeSort Buttom-Up Approach
	 */
	public static <T extends Comparable<T>> void sort(T[] arr){		
		Comparable[] aux = new Comparable[arr.length];
		for(int i=1; i<arr.length; i*=2)
			for(int j=0; j+i<arr.length; j+=2*i)
				merge(arr, aux, j, i+j-1, Math.min(j+2*i-1, arr.length-1));
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
			else if	(less(aux[i], aux[j]))	  arr[k] = aux[i++];
			else							  arr[k] = aux[j++];
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
