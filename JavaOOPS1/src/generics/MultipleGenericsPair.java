package generics;

public class MultipleGenericsPair<T,S> {
	public T first;
	public S second;
	
	public MultipleGenericsPair(T first,S second) {
		this.first=first;
		this.second=second;
	}
	
	public MultipleGenericsPair() {
		
	}
	
	public T getFirst() {
		return first;
	}
	
	public S getSecond() {
		return second;
	}
	
	public void setFirst(T first) {
		this.first=first;
	}
	
	public void setSecond(S second) {
		this.second=second;
	}
}
