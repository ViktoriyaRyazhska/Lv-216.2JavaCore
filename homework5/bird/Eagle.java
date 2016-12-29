package homework5.bird;

public class Eagle extends FlyingBird {

	
	@Override
	public String toString() {
		return "Eagle " + feathers + ", " + layEggs + " ";
	}

	public Eagle(String feathers, String layEggs) {
		super(feathers, layEggs);
		// TODO Auto-generated constructor stub
	}

}
