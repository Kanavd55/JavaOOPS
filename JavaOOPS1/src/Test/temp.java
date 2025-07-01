package Test;
import Inheritance.Vehicle;
public class temp extends Vehicle {
	public temp() {
		super(100);
		System.out.println("temp constructor");
	}
	public void print() {
		super.print();
		System.out.println(super.getWheels());
		System.out.println("This is " + maxSpeed );
	}
}

//Protected Access modifier
//Properties or functionalities are accessible within the same package similar to default access modifier.If the package is different then the protected properties or functionalities are accessible only in the derived class.
//Super is a keyword used to access the parent class properties or methods.
//Polymorphism means one thing is taking multiple form.Runtime polymorphism.