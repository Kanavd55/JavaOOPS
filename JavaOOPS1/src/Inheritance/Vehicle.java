package Inheritance;

public class Vehicle {
	protected int maxSpeed;
	String color;
	private int wheels;
	
	public void print() {
		System.out.println("Vehicle"+" color "+color+" maxSpeed " + maxSpeed);
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels=wheels;
	}
}
