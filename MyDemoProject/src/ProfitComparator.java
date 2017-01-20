import java.util.Comparator;


public class ProfitComparator implements Comparator<FarmsProducts>{

	@Override
	public int compare(FarmsProducts o1, FarmsProducts o2) {
		return Double.compare(o2.getProfit(), o1.getProfit());
		//return (int) (((FarmsProducts)o1).getProfit() - ((FarmsProducts)o2).getProfit());
	}
}
