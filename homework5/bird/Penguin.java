package homework5.bird;

public class Penguin extends NonFlyingBird {

	
	@Override
	public String toString() {
		return "Penguin " + feathers + ", " + layEggs + " ";
	}

	public Penguin(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

	
}
