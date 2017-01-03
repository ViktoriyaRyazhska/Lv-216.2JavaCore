package Bird;

public class NonFlyingBird extends Bird {
	
	
	
	
	public NonFlyingBird(String feathers, int layeggs) {
		super(feathers, layeggs);
		}

	@Override
	void fly() {
		System.out.println("This class can NOT fly");
	}

	@Override
	void showInfo() {
		super.showInfo();
	}

	
}

