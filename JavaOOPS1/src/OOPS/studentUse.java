package OOPS;
public class studentUse {
	public static void main(String[] args) {
		student s1 = new student();
		System.out.println(s1.name +" " + s1.rollNumber);
		s1.name="Kanav";
		s1.rollNumber=12;
		System.out.println(s1.name +" " + s1.rollNumber);
		student s2 = new student();
	}
}
