package chapter12;

public class Util1 {
	public static <K,V> boolean compare(Pair<K,V>p1,Pair<K,V>p2) {
		boolean keycompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keycompare && valueCompare;
	}

}