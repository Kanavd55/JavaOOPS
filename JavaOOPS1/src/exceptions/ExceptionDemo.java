package exceptions;

public class ExceptionDemo {
	
	public static void divide(int a , int b) throws DivideByZeroException{
		if(b==0) {
			throw new DivideByZeroException();
		}
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		try {
			divide(5,0);
		}catch(DivideByZeroException e) {
			System.out.println("Divide By Zero Exception");
			//e.printStackTrace();
		}finally {
			System.out.println("Hello");
		}
	}
}
