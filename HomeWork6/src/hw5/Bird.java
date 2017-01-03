package hw5;

public abstract class Bird {
	String feathers;
	int layeggs;
	
	abstract void fly();

	public Bird(String feathers, int layeggs) {
		this.feathers = feathers;
		this.layeggs = layeggs;
	}
	
	
	
}
