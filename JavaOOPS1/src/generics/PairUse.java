package generics;

public class PairUse {
	public static void main(String[] args) {
		Pair<Integer> p = new Pair<Integer>(10,20);
		System.out.println(p.getFirst()+" "+p.getSecond());
		Pair<String> pI = new Pair<String>("aa","bb");
		System.out.println(pI.getFirst()+" "+pI.getSecond());
	}
}
