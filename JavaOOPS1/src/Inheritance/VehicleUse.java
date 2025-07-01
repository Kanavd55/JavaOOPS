package Inheritance;

public class VehicleUse {
	public static void main(String[] args) {
		Car c = new Car();
		c.color="black";
		c.maxSpeed=250;
		c.numDoors=4;
		Bicycle b = new Bicycle();
		b.color="red";
		b.maxSpeed=40;
		b.print();
		c.print();
		c.printCar();
		c.setWheels(4);
		System.out.println(c.getWheels());
		System.out.println(b.getWheels());
		Vehicle v2 = new Car();
		Car d =(Car) v2;
		v2.print();
		d.numDoors=5;
	}
}
