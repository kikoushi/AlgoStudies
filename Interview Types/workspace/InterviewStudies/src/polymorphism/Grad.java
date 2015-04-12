package polymorphism;

public class Grad extends Student{
	
	private double salary;
	
	public Grad(){
		super();
		this.salary = 0;
		this.setIDtype("G");
	}
	
	public Grad(Integer ID, String name, String surname, String dept, String institute, String idType, double salary){
		super(ID, name, surname, dept, institute);
		this.setIDtype(idType);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return super.toString() + " type:" + this.getIDtype() + " salary:" +this.getSalary();
	}

}
