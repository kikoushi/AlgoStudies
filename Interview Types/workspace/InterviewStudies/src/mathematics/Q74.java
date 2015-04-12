package mathematics;

public class Q74 {

	
	public static int multiply(int a, int b){		
		if(Math.abs(a)<Math.abs(b))
			return multiply(b,a);
		
		int res = 0;
		for(int i=0; i<Math.abs(b); i++)
			res += a;
		return b<0 ? -res : res;
	}
	
	
	public static double division(int a, int b){	
		int abs_a = Math.abs(a);
		int abs_b = Math.abs(b);
		
		if(b==0) throw new IllegalArgumentException("Argument cannot be 0");
		
		if(abs_a<abs_b)
			return 0;
		
		int count = 0;
		for(int i=abs_b; i<=abs_a; i+=abs_b)
			count++;
		
		return ((a<0 && b>0) || (b<0 && a>0)) ? -count : (int)count;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(multiply(5,6));
		System.out.println(division(-10,-3));
	}
	

}
