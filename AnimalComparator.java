import java.util.Comparator;

public class AnimalComparator implements Comparator<FarmsProducts> {
	
	@Override
	public int compare(FarmsProducts o1, FarmsProducts o2) {
		return ((FarmsProducts)o1).getKind_of_animal().compareTo(((FarmsProducts)o2).getKind_of_animal());
	}
}
