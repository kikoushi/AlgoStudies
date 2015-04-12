package polymorphism;

public class Student {
	
	private Integer ID;
	private String name;
	private String otherNames;
	private String surname;
	private String dept;
	private String institute;
	private String IDtype;
	
	public Student(){
		ID = null;
		name = "";
		otherNames = "";
		surname = "";
		dept = "";
		institute = "";
	}
	public Student(Integer ID, String name, String surname, String dept, String institute){
		this.ID = ID;
		this.name = name;
		this.otherNames = "";
		this.surname = surname;
		this.dept = dept;
		this.institute = institute;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOtherNames() {
		return otherNames;
	}
	public void setOtherNames(String otherNames) {
		this.otherNames = otherNames;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer ID) {
		this.ID = ID;
	}
	public String getIDtype() {
		return IDtype;
	}
	public void setIDtype(String iDtype) {
		IDtype = iDtype;
	}
	
	public String toString(){
		return this.ID + " " + this.name;
	}

}
