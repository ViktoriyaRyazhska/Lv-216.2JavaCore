package homework5.bird;

public class Chicken extends NonFlyingBird {

	
	@Override
	public String toString() {
		return "Chicken " + feathers + ", " + layEggs + " ";
	}

	public Chicken(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	
}
