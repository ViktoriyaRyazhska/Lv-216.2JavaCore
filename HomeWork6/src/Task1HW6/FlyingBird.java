package Task1HW6;

public class FlyingBird extends Bird{

	public String feathers;
	public String layEggs;
	
	public FlyingBird(String feathString, String layString) {
		this.feathers = feathString;
		this.layEggs = layString;
	}
	
	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public String getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(String layEggs) {
		this.layEggs = layEggs;
	}

	@Override
	public String toString(){
		return "feathers " + feathers + ", layEggs " +layEggs;
		
	}
	
	@Override
	public void fly() {
		System.out.println("I can fly!!!");
		
	}
	
}
