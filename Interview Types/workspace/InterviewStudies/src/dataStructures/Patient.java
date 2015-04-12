package dataStructures;

import java.util.Comparator;

public class Patient{
	
	public static final Comparator<Patient> BY_ID = new ById();
	public static final Comparator<Patient> BY_PRIORITY = new ByPriority();
	private String name;
	private String id;
	private int priority;
	
	public Patient(String n, String id, int p){
		name = n;
		this.id = id;
		priority = p;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public String toString(){
		return name + " " + id + " " + priority;
	}

	
	private static class ById implements Comparator<Patient>{
		public int compare(Patient p1, Patient p2) {
			return p1.id.compareTo(p2.id);
		}
	}	
	private static class ByPriority implements Comparator<Patient>{
		public int compare(Patient o1, Patient o2) {
			if(o1.priority < o2.priority) return 1;
			else if(o1.priority > o2.priority) return -1;
			return 0;
		}		
	}

}
