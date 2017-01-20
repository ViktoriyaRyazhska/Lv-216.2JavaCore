
public class Eggs extends FarmsProducts {
	private int count;
	private String sort;
	
	public Eggs(String kind_of_animal, double price, int count, String sort) throws KindOfAnimalException {
		super(kind_of_animal, price);
		this.count = count;
		this.sort = sort;
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public Double calculateProfit() {
		return profit = count*price;
	}
	
	@Override
	public String toString() {
		return "Eggs [animal=" + kind_of_animal + ", profit=" + String.format("%.2f",profit)
				+ ", price=" + price + ", count=" + count
				+ ", sort=" + sort
				+ "]";
	}
	
	@Override
	public String printSortByKind() {
		return getSort();
	}
	
}
