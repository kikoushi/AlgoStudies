package dataStructures;

public abstract class Q37AnimalClass {
//public abstract class Animal {

	private int index;
	private String name;
	
//	public Q37(){
//		this.index = 0;
//		this.name = "";			
//	}
	
	public Q37AnimalClass(String name){
		this.name = name;			
	}
	
	public void setIndex(int index){
		this.index = index;
	}
	
	public int getIndex(){
		return this.index;
	}
	
	public String getName(){
		return this.name;
	}
}
