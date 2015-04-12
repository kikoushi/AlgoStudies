package sortAlgos;

import coursera_algo1_princeton.KnuthShuffle;



/**
 * Basic Plan; create min-heap, remove one by one.
 * @author cm
 *
 */
public class HeapSort{

	public static <T extends Comparable<T>> void sort(T[] arr){
		heapify(arr);
		int N = arr.length-1;
		
		while(N>1){
			exch(arr, 1, N--);			
			sink(arr, N, 1);
		}
	}	
	
	
	private static <T extends Comparable<T>>  void heapify(T[] arr){
		for(int k=arr.length/2; k>0; k--)
			sink(arr, arr.length-1, k);
	}
	
	private static <T extends Comparable<T>>  void sink(T[] arr, int N, int k){
		while(2*k<=N){
			int g=2*k;
			if(g<N && less(arr[2*k+1],arr[2*k])) ++g;
			if(!less(arr[g], arr[k])) break;
			exch(arr,k,g);
			k=g;
		}
	}
	
	private static <T extends Comparable<T>> boolean less(T t1, T t2){	return t1.compareTo(t2)<0;	}
	private static <T extends Comparable<T>> void exch(T[] arr, int i, int j){
		T aux = arr[i];
		arr[i] = arr[j];
		arr[j] = aux;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {0,1,2,3,4,5,6,7,7,12,122,11,23};
		
		KnuthShuffle.shuffle(arr,1,arr.length-1);
		Integer[] aux = arr.clone();
		for(int i: aux)
			System.out.print(i + " ");
		System.out.println();
//		System.out.println(numbers[0]);
		heapify(arr);
		sort(arr);
		for(int i: arr)
			System.out.print(i + " ");
	}
}
