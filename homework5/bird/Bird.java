package homework5.bird;

public abstract class Bird {
	public String feathers;
	public String layEggs;
	

	public Bird(String feathers, String layEggs) {
		super();
		this.feathers = feathers;
		this.layEggs = layEggs;
	}



	public abstract void fly();
}
