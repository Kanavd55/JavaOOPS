package Test;
import OOPS.student;
import Inheritance.Vehicle;
public class Test {
	public static void main(String[] args) {
		student s1 = new student("Karan",36);
		s1.name="Kanav";
		System.out.println(s1.name);
		Vehicle v1 = new Vehicle(123);
	}
}
