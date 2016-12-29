package homework5.bird;

public class Swallow extends FlyingBird {
	

	@Override
	public String toString() {
		return "Swallow  " + feathers + ", " + layEggs + " ";
	}

	public Swallow(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	
}
