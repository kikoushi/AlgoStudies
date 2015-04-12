package dataStructures;

public class Q17 {

	static int[][] sol1(int[][] m){
		
		boolean[] arr_row = new boolean[m.length];
		boolean[] arr_col = new boolean[m[0].length];
		
		for(int i=0; i<m.length; i++)
			for(int j=0; j<m[0].length; j++)
				if(m[i][j] == 0){
					arr_row[i] = true;
					arr_col[j] = true;
				}

//		for(boolean b: arr_row)
//			System.out.print(b);
//		System.out.println();
//		for(boolean b: arr_col)
//			System.out.print(b);		
		
		for(int i=0; i<m.length; i++)
			for(int j=0; j<m[0].length; j++)
				if(arr_row[i] || arr_col[j])
					m[i][j] = 0;
		
		return m;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mtrx[][] = new int[5][5];
		for(int i=0; i<mtrx.length; i++)
			for(int j=0; j<mtrx[0].length; j++)
				mtrx[i][j] = 3;
		
		mtrx[2][0] = 0;
		
		
		int m[][] = sol1(mtrx);
		for(int[] row: m){
			for(int val: row)
				System.out.print(val+ " ");
			System.out.println();
		}
	}

}
