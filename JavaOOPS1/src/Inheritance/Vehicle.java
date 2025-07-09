package Inheritance;

public final class Vehicle {
	protected int maxSpeed;
	String color;
	private int wheels;
	
	void print() {
		System.out.println("Vehicle"+" color "+color+" maxSpeed " + maxSpeed);
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels=wheels;
	}
	
	public Vehicle(int num) {
		System.out.println("Vehicle Constructor");
	}
}
