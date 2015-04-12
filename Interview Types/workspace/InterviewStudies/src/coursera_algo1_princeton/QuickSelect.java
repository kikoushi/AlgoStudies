package coursera_algo1_princeton;

public class QuickSelect {	

	public static Comparable quickSelect(Comparable[] arr, int k){
	 	if(k<0 || k>=arr.length)
	 		throw new IllegalArgumentException("Illegal argument!");
	 	
	 	int lo=0;
	 	int hi=arr.length-1;
	 	
	 	KnuthShuffle.shuffle(arr);
	 	while(true){
	 		int idx = partition(arr, lo, hi);
		 	if(idx < k) 
		 		lo = idx+1;
		 	else if(k < idx)
		 		hi = idx-1;
		 	else
		 		return arr[idx];
		}
	}
	
	private static int partition(Comparable[] arr, int lo, int hi){
	
		Comparable a = arr[lo];
		int i=lo;
		int j=hi+1;
		
		while(true){		
			while(!less(a,arr[++i]))
				if(i==hi) break;
			while(!less(arr[--j],a))
				if(j==lo) break;
			
			if(i>=j) break;
			exch(i, j, arr);
		}
		exch(lo, j, arr);
		return j;
	}
			
	private static boolean less(Comparable x, Comparable y){
		return (x.compareTo(y) < 0);
	}
	private static void exch(int i, int j, Comparable[] arr){
		Comparable c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

//	public static<T extends Comparable<T>> T kthSmallestElement(T[] arr, int k){		
//		if(k<0|| k>=arr.length)
//			throw new IllegalArgumentException();
//		
//		KnuthShuffle.shuffle(arr);
//		return kthSmallestElement(arr, k, 0, arr.length-1);
//	}
//	
//	private static<T extends Comparable<T>> T kthSmallestElement(T[] arr, int k, int lo, int hi){		
//		
//		while(true){
//			int par = partition(arr, lo, hi);
//			if(par < k)  			lo = par+1;
//			else if(par > k)   hi = par - 1;
//			else return arr[k];			
//		}
//	}
//	
//	private static <T extends Comparable<T>>  int partition(T[] arr, int lo, int hi){		
//		int i = lo;
//		int j= hi+1;
//		
//		while(true){
//			while(!less(arr[lo], arr[++i])) 
//				if(i == hi) break;
//			while(!less(arr[--j],arr[lo]))
//				if(j == lo) break;
//			
//			if(i >= j) break;
//			exch(arr, i, j);
//		}
//		exch(arr, j, lo);
//		return j;
//	}
//	
//	private static <T extends Comparable<T>> boolean less(T t1, T t2){
//		return t1.compareTo(t2) < 0;
//	}
//	private static <T extends Comparable<T>> void exch(T[] arr, int i, int j){
//		T aux = arr[i];
//		arr[i] =arr[j];
//		arr[j] = aux;
//	}
	
	
	public static void main(String[] args) {
		Integer[] myArr = new Integer[]{3,6,2,7,99,23,11}; 
		System.out.println(quickSelect(myArr, 3));
	}

}
