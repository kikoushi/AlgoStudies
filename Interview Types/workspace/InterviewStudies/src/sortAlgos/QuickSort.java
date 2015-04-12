package sortAlgos;

import coursera_algo1_princeton.KnuthShuffle;

public class QuickSort{
	
	public static <T extends Comparable<T>> void sort(T[] arr){
		KnuthShuffle.shuffle(arr); 		// arr is randomly shuffled.
		sort(arr, 0, arr.length-1);
	}	
	public static <T extends Comparable<T>> void sort(T[] arr, int lo, int hi){
		if(lo>=hi) return;
		int part = partition(arr, lo, hi);
		sort(arr, lo, part-1);
		sort(arr, part+1, hi);
	}
	private static <T extends Comparable<T>> int partition(T[] arr, int lo, int hi){
		T pivot = arr[lo];
		int i=lo;
		int j=hi+1;
		while(true){
			while(!less(pivot, arr[++i]))
				if(i==hi) break;
			while(!less(arr[--j], pivot))
				if(j==lo) break;
			if(j<=i) break;
			exch(i, j, arr);
		}
		exch(j, lo, arr);
		return j;
	}	
	
	private static <T extends Comparable<T>> boolean less(T t1, T t2){
		return (t1.compareTo(t2) < 0);
	}	
	private static <T extends Comparable<T>> void exch(int i, int j, T[] arr){
		T aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux; 
	}	
	
//	private static <T extends Comparable<T>>boolean greater(Comparable x, Comparable y){
//		return (x.compareTo(y) > 0);
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] numbers = {0,1,2,3,4,5,6,7,7,12,122,11,23};
//		System.out.println(numbers[0]);
		sort(numbers);
		for(int i: numbers)
			System.out.println(i + " ");
	}

}
