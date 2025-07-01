package Test;
import Inheritance.Vehicle;
public class temp extends Vehicle {
	public void print() {
		System.out.println("This is " + maxSpeed );
	}
}

//Protected Access modifier
//Properties or functionalities are accessible within the same package similar to default access modifier.If the package is different then the protected properties or functionalities are accessible only in the derived class.
