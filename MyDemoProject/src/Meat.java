
public class Meat extends FarmsProducts {
	private double weight;
	private String sort;
	
	public Meat(String kind_of_animal, double price, double weight, String sort) throws KindOfAnimalException {
		super(kind_of_animal, price);
		this.weight = weight;
		this.sort = sort;
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public Double calculateProfit() {
		return profit = weight*price;
	}
	
	@Override
	public String toString() {
		return "Meat [animal=" + kind_of_animal + ", profit=" + String.format("%.2f",profit)
				+ ", price=" + price + ", weight=" + weight
				+ ", sort=" + sort
				+ "]";
	}
	
	@Override
	public String printSortByKind() {
		return getSort();
	}
	
}
