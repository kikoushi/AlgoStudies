package recursion;

public class MicArrayQuestion{
	public static int findOneSize(boolean[] bools, int sp, int ep){
		if(sp+1 == ep) return sp+1;
		else{
			int mp = sp+(int)Math.floor((ep-sp)/2.0);
			return bools[mp]==true ? findOneSize(bools, mp, ep) : findOneSize(bools, sp, mp);
		}
	}
	
	public static void main(String[] args){
		boolean[] m_arr = {true, true, true, true, false, false};
		System.out.println(5/2);
		System.out.println(findOneSize(m_arr, 0, m_arr.length));		
	}
}