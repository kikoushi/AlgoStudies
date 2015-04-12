package sortAlgos;

import java.util.ArrayList;
import java.util.Collections;

import coursera_algo1_princeton.KnuthShuffle;

public class MainClass_Sort {	
	
	public static Integer[] generateArray(int limit){
		ArrayList<Integer> aux = new ArrayList<Integer>();
		for(int i=0; i<limit; i++)
			aux.add(i);
		
		Collections.shuffle(aux);
		return aux.toArray(new Integer[limit]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] numbers  = new Integer[100];
		for(int i=0; i<numbers.length; i++)
			numbers[i] = i;
		KnuthShuffle.shuffle(numbers);
		Integer[] n2 = numbers.clone(); // Copies the values only, copy by value.
		Integer[] n3 = numbers; // Copies the address of the array, copy by reference.
		
//		SelectionSort.sort(numbers);		
//		InsertionSort.sort(numbers);
//		InsertionSort.sort(numbers, 2, 4);
//		ShellSort.sort(numbers);
		Shell.sort(numbers,3);
//		MergeSortButtomUp.sort(numbers);
				
		for(int i=0; i<numbers.length; i++)
			System.out.println(numbers[i] + "\t" + n2[i] );
	}
}
