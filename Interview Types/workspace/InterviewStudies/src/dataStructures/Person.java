package dataStructures;

public class Person implements Comparable<Person>{

	private String id;
	private String name;
	private int age;
	
	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int compareTo(Person p){
		if(this.age > p.age) return 1;
		if(this.age < p.age) return -1;
		return 0;
	}
	
	public String toString(){
		return "Name: " + name + ", Age: " + age;
	}
}
