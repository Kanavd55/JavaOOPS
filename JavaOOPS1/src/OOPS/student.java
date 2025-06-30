package OOPS;

public class student {
	public String name;
	private int rollNumber;
	final double double_conversion;
	private static int numstudents;
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		if(rollNumber<0) {
			return;
		}
		this.rollNumber=rollNumber;
	}
	
	public static int getNumStudents() {
		return numstudents;
	}
	//Note: you cannot access not static values inside static functions
	
	public student(String name,int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.double_conversion = rollNumber+1;
		numstudents++;
	}
	
	public student(String name) {
		this.name=name;
		this.double_conversion = 2+1;
		numstudents++;
	}
}


//Access modifiers
//Private access modiefiers limits the access of properties or functionalities/methods within the same class
//Name is a default modifier - They are accessible within the same package.
//Public modifier means the properties or functionalities are accessible within the same project.
//Final keyword - Properties or functionalities initialized with Final keyword can be assigned only either in the constructor or while declaring the variable
//Static keyword - Properties or functionalities initialized with static keyword,they belong to classes not to the object.