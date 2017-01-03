package Task1Task2_HW7;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class UnionAndIntersectTask1 {
	static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> set_union_rez = new HashSet<Integer>();
		
		for(Integer el: set1){
			set_union_rez.add(el);
		}
		for(Integer el: set2){
			set_union_rez.add(el);
		}
		
		return set_union_rez;
	}
	
	static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> set_rez_intersect = new HashSet<Integer>();
		
		for(Integer el: set1){
			if(set2.contains(el)){
				set_rez_intersect.add(el);
			}
		}
		
		return set_rez_intersect;
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		
		Set<Integer> set_1 = new HashSet<Integer>();
		for(int i = 0; i < 15; i++){
			set_1.add(rnd.nextInt(25));
		}
		System.out.println("Set_1: " + set_1);
		
		Set<Integer> set_2 = new HashSet<Integer>();
		for(int i = 0; i < 15; i++){
			set_2.add(rnd.nextInt(25));
		}
		System.out.println("Set_2: " + set_2);
		
		Set<Integer> set_union = new HashSet<Integer>();
		set_union = union(set_1, set_2);
		System.out.println("Set_rez union: " + set_union);
		
		Set<Integer> set_intersect = new HashSet<Integer>();
		set_intersect = intersect(set_1, set_2);
		System.out.println("Set_rez intersect: " + set_intersect);
	}

}
