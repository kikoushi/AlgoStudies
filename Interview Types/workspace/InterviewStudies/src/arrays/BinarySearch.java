package arrays;

import java.util.Arrays;

public class BinarySearch {	
	
	/**
	 * Binary Search iterative
	 * @param vals
	 * @param key
	 * @return
	 */
	public static int search(int[] vals, int key){		
		Arrays.sort(vals);		
		int strt= 0;
		int end = vals.length-1;		
		
		while(strt <= end){
			int mid = strt + (end - strt)/2;
			if( vals[mid] == key)
				return mid;
			
			if(key < vals[mid])
				end = mid-1;
			else
				strt = mid+1;
		}
		return -1;			
	}	
	
	/**
	 * Binary search recursive
	 * @param s
	 * @param e
	 * @param vals
	 * @param key
	 * @return
	 */
	public static int search(int s, int e, int[] vals, int key){		
		if(s>e)
			return -1;
		
		int mid = s + (e-s)/2;
		if(vals[mid] == key)
			return mid;
		
		if(key < vals[mid])
			return search(s, mid-1, vals, key);
		return search(mid+1, e, vals, key);		
	}
	
	
	

	/**
	 * In a boolean array (0s, 1s) sorted in ascending order, finding the first occurrence of 1s.
	 * @param vals
	 * @return the index
	 */
	public static int zeroToOneIdx(int[] vals){
		return zeroToOneIdx(0, vals.length-1, vals);
	}
	public static int zeroToOneIdx(int st, int ed, int[] vals){

		if(st+1==ed)				
			if(vals[st]==0 && vals[ed]==1)
				return ed;
			else
				return -1;
		
		int mid = (st+ed)/2;
		if(vals[mid] == 0)
			return zeroToOneIdx(mid, ed, vals);
		else
			return zeroToOneIdx(st, mid, vals);
	}
	
	
	
	
	/**
	 * Finding the index where the elements in the array starts to decrement. 
	 * @param vals
	 * @return the index
	 */
	
	public static int sortedArrayErrorIdx(int[] vals){
		return sortedArrayErrorIdx(0, vals.length-1, vals);
	}
	public static int sortedArrayErrorIdx(int s, int e, int[] vals){	
		
		if(s+1 == e)
			if(vals[s]>vals[e])
				return e;
			else
				return -1;
		
		int mid = s+(e-s)/2;
//		if(vals[mid] <= vals[mid+1]) DOES NOT WORK THIS WAY! WHY?????????????
		if(vals[mid-1] <= vals[mid]) 
			return sortedArrayErrorIdx(mid, e, vals);
		else
			return sortedArrayErrorIdx(s, mid, vals);
	}	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(zeroToOneIdx(new int[]{0,1,1,1,1,1}));
		System.out.println(sortedArrayErrorIdx(new int[]{1,3,6,4,3,2,1}));
		System.out.println(search(new int[]{1,3,32,76,77,99,101,111,112,114}, 114));
		System.out.println(search(0, 9, new int[]{1,3,32,76,77,99,101,111,112,114}, 33));
	}
}
