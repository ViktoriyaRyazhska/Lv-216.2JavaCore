package Task1HW6;

public class NonFlyingBird extends Bird{

	public NonFlyingBird(String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	@Override
	public void fly() {
		System.out.println("I can't fly!!!");
		
	}
	
	@Override
	public String toString(){
		return "feathers " + feathers + ", layEggs " +layEggs;
		
	}

}
