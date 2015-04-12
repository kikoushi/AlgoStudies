package polymorphism;

public class Undergrad extends Student{

	private double yearlyFee;
	
	public Undergrad(){
		super();
		this.yearlyFee = 0;
		this.setIDtype("UG");
	}
	
	public Undergrad(Integer ID, String name, String surname, String dept, String institute, String idType, double yF){
		super(ID, name, surname, dept, institute);
		this.setIDtype(idType);
		this.yearlyFee = yF;
	}

	public double getYearlyFee() {
		return yearlyFee;
	}

	public void setYearlyFee(double yearlyFee) {
		this.yearlyFee = yearlyFee;
	}
	
	public String toString(){
		return super.toString() + " type:" + this.getIDtype() + " fee:" +this.getYearlyFee();
	}
}
