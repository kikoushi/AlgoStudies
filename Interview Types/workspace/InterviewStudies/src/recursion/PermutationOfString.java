package recursion;
import java.util.*;

/**
 * 
 * @author cm
 * @info Gives all possible permutations of a given string
 *
 */
public class PermutationOfString {

    private static int count = 0;
	public static void permuteString(String pref, String str){

		int n = str.length();
		if(n==0){
            System.out.println(pref);
            System.out.println(++count);
        }

		else
			for(int i=0; i<n; i++)
                permuteString(pref + str.charAt(i), str.substring(0,i) + str.substring(i+1,n));

	}	
	
	public static void main(String[] args){
		String toPermute = "abcde";
//		System.out.println(toPermute.substring(1,5));
		permuteString("", toPermute);
	}
	
}
