package polymorphism;

import java.util.ArrayList;
import java.util.HashMap;

public class RunPoly {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student s = new Student(123, "normal student", "normal", "eng", "cs");
		Student gs = new Grad(1234, "grad student", "normal", "eng", "cs", "G", 1000);
		Student ugs = new Undergrad(12345, "undergrad student", "normal", "eng", "cs", "UG", 20000);
		
		System.out.println(s instanceof Student);
		System.out.println(gs instanceof Grad);
		System.out.println(ugs instanceof Undergrad);
		
		ArrayList<Student> stList = new ArrayList<Student>();
		stList.add(s);
		stList.add(gs);
		stList.add(ugs);
		
		for(Student st: stList){
			System.out.println(st.toString());
		}		
		
		System.out.println();
		HashMap<Integer, Grad> stMap = new HashMap<Integer, Grad>();
		for(Student st: stList){
			if(st instanceof Grad)
				stMap.put(st.getID(), (Grad)st);
		}
		System.out.println(stMap.toString());
	}

}
