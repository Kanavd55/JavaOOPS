package generics;

public class PairUse {
	public static void main(String[] args) {
		Pair<Integer> p = new Pair<Integer>(10,20);
		System.out.println(p.getFirst()+" "+p.getSecond());
		Pair<String> pI = new Pair<String>("aa","bb");
		System.out.println(pI.getFirst()+" "+pI.getSecond());
		Pair<Character> ch = new Pair<Character>('s','f');
		System.out.println(ch.getFirst()+" "+ch.getSecond());
		Pair<Double> d = new Pair<Double>(10.20,30.20);
		System.out.println(d.getFirst()+" "+d.getSecond());
		MultipleGenericsPair<String,Integer> multiple = new MultipleGenericsPair<String,Integer>("kanav",2808);
		System.out.println(multiple.getFirst()+" "+multiple.getSecond());
		MultipleGenericsPair<Integer,String> Temp = new MultipleGenericsPair<Integer,String>(2808,"Dahat");
		//Chained generics
		MultipleGenericsPair<MultipleGenericsPair<Integer,String>,String> Kanav = new MultipleGenericsPair<MultipleGenericsPair<Integer,String>,String>();
		System.out.println(Kanav.getFirst()+" "+Kanav.getSecond());
		Kanav.setFirst(Temp);
		System.out.println(Kanav.getFirst().getFirst());
		System.out.println(Kanav.getFirst().getSecond());
	}
}
