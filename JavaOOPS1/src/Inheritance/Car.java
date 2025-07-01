package Inheritance;

public class Car extends Vehicle {
	int numDoors;
	
	public void printCar() {
		System.out.println("Car color is" + color + " maxspeed " + maxSpeed);
	}
	
	//Function overriding
	public void print() {
		System.out.println("Car color " + color + " maxspeed" + maxSpeed);
	}
}
