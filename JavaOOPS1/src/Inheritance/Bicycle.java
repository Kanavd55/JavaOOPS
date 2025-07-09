package Inheritance;

public class Bicycle extends Vehicle {
	public Bicycle() {
		super(100);
		System.out.println("Bicycle constructor");
	}
	
	public boolean isMotorized() {
		return false;
	}
	
	public String getColor() {
		return "Blue";
	}
}
