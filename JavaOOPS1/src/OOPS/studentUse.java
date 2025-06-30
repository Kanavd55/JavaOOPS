package OOPS;
public class studentUse {
	public static void main(String[] args) {
		student s1 = new student("Kanav",12);
		System.out.println(s1.name +" " + s1.getRollNumber());
		s1.name="Kanav";
		s1.setRollNumber(12);
		System.out.println(s1.name +" " + s1.getRollNumber());
		student s2 = new student("Raj",15);
		System.out.println(student.getNumStudents());
	}
}

