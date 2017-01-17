import java.util.Comparator;

public class FarmsProducts implements IÑalculateProfit, ICalculateSort {

	protected double price;
	protected KindOfAnimalEnum kind_of_animal;
	protected Double profit = 0.0;
	protected String sort = null;
	
	public FarmsProducts(String kind_of_animal, double price) throws KindOfAnimalException {
		this.kind_of_animal = kindOfAnimalStrToEnum(kind_of_animal);
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public KindOfAnimalEnum getKind_of_animal() {
		return kind_of_animal;
	}

	public void setKind_of_animal(KindOfAnimalEnum kind_of_animal) {
		this.kind_of_animal = kind_of_animal;
	}
	
	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	private KindOfAnimalEnum kindOfAnimalStrToEnum(String kind_of_animal) throws KindOfAnimalException {
		switch(kind_of_animal.toLowerCase()){
			case "chicken" : return KindOfAnimalEnum.CHICKEN;
			case "duck" : return KindOfAnimalEnum.DUCK;
			case "turkey" : return KindOfAnimalEnum.TURKEY;
			case "ostrish" : return KindOfAnimalEnum.OSTRISH;
			case "pig" : return KindOfAnimalEnum.PIG;
			case "bull" : return KindOfAnimalEnum.BULL;
			case "cow" : return KindOfAnimalEnum.COW;
			case "goat" : return KindOfAnimalEnum.GOAT;
			default : throw new KindOfAnimalException("Input only chicken, duck, turkey, ostrish, pig, bull, cow or goat animal.");
		}
	}
	
	public static Comparator<FarmsProducts> compareByProfit() {
		ProfitComparator profit_comparator = new ProfitComparator();
		return profit_comparator;
	}
	
	public static Comparator<FarmsProducts> compareByAnimal() {
		AnimalComparator animal_comparator = new AnimalComparator();
		return animal_comparator;
	}
	
	@Override
	public Double calculateProfit() {
		return 0.0;
	}
	//String.format("%.2f",averageMonthlySalary)

	@Override
	public String printSortByKind() {
		return null;
	}
	
}
