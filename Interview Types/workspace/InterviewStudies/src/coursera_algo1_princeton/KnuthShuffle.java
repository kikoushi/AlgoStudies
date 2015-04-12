package coursera_algo1_princeton;

public class KnuthShuffle {
	
	private KnuthShuffle(){}
	
	public static void shuffle(Object[] arr){
		shuffle(arr, 0, arr.length-1);		
	}
			
	public static void shuffle(Object[] arr, int lo, int hi){
		int n = hi+1;
		for(int i=lo; i<n; i++){
			int rd = i + (int) (Math.random() * (n-i)); // Creates a random number between i and n;
			Object o = arr[rd];
			arr[rd] = arr[i];
			arr[i] = o;
		}
	}
	
	public static void main(String[] args) {

		Integer[] numbers = {0,1,2,3,4,5,6,7,7,12,122,11,23};
//		System.out.println(numbers[0]);
		shuffle(numbers);
		for(int i: numbers)
			System.out.println(i + " ");
	}

}
