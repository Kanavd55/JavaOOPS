package generics;

public class print {
	
	public static<T> void printArray(T[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static<T extends Vehicle> void print(T[] arr){
		for(int i=0;i<arr.length;i++) {
			arr[i].printArray();
		}
	}
	public static void main(String[] args) {
		Integer[] arr = new Integer[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		printArray(arr);
		Vehicle[] v = new Vehicle[5];
		for(int i=0;i<v.length;i++) {
			v[i]=new Vehicle();
		}
		printArray(v);
	}
}
