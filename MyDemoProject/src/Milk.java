
public class Milk extends FarmsProducts {
	private double volume;
	private double fatness;
	
	public Milk(String kind_of_animal, double price, double volume, double fatness) throws KindOfAnimalException {
		super(kind_of_animal, price);
		this.volume = volume;
		this.fatness = fatness;
	}
	
	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public double getFatness() {
		return fatness;
	}

	public void setFatness(double fatness) {
		this.fatness = fatness;
	}

	@Override
	public Double calculateProfit() {
		return profit = volume*price;
	}
	
	@Override
	public String toString() {
		return "Milk [animal=" + kind_of_animal + ", profit=" + String.format("%.2f",profit)
				+ ", price=" + price + ", volume=" + volume
				+ ", fatness=" + fatness
				+ "]";
	}
	
	@Override
	public String printSortByKind() {
		return null;
	}
	
}
