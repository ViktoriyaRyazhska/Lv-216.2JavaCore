package homework6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class UnionIntersect {

	static <Integer> void union(Set<Integer> set1, Set<Integer> set2) {
		set1.addAll(set2);
	}

	static <Integer> void intersect(Set<Integer> set1, Set<Integer> set2) {
		set1.retainAll(set2);
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Set<Integer> set3 = new HashSet<Integer>();

		for (int i = 0; i < 20; i++) {
			set3.add(rand.nextInt(20));
		}
		System.out.println(set3);

		Set<Integer> set4 = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {
			set4.add(rand.nextInt(20));
		}

		System.out.println(set4);
		union(set3, set4);
		System.out.println(set3);
		intersect(set3, set4);
		System.out.println(set3);

	}

}
