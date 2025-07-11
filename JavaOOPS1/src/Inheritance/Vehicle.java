package Inheritance;

public class Vehicle implements VehicleInterface {
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
	
	@Override
	public boolean isMotorized() {
		System.out.println(time);
		return true;
	}
	
	@Override
	public String getColor() {
		return "red";
	}
}
