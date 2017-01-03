package Bird;

public class FlyingBird extends Bird {
	
	
	public FlyingBird(String feathers, int layeggs) {
		super(feathers, layeggs);
		
	}
	
	@Override
	void fly() {
		System.out.println("This class can fly");
	}

	@Override
	void showInfo() {
		super.showInfo();
	}
	
}
