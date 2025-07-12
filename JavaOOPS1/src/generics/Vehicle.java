package generics;

public class Vehicle {
	int maxSpeed;
	String company;
	
	public Vehicle(){}
	
	public Vehicle(int maxSpeed,String company) {
		this.maxSpeed=maxSpeed;
		this.company=company;
	}
	
	public void printArray() {
		System.out.println(this.maxSpeed+" "+this.company);
	}
}
